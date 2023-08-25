package com.calculator.controller;

import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.model.AjaxResponseBody;
import com.calculator.model.Tax;
import com.calculator.services.CalculatorService;

@RestController
@RequestMapping("/api")
public class CalculatorController {

	@Autowired
	private CalculatorService calculatorService;

	@PostMapping("/calculate")
	public ResponseEntity<?> calculateTax(@RequestBody Tax tax, Errors errors) {

		AjaxResponseBody result = new AjaxResponseBody();

		// If error, just return a 400 bad request, along with the error message
		if (errors.hasErrors()) {

			result.setMsg(
					errors.getAllErrors().stream().map(x -> x.getDefaultMessage()).collect(Collectors.joining(",")));
			return ResponseEntity.badRequest().body(result);

		}

		Double value = calculatorService.getTax(tax.getTax(), tax.getValue());
		if(value !=null) {
			result.setMsg("Tax Successfully Calculated");
			result.setResult(value);
			result.setAddressLine(tax.getAddressLine());
			result.setCustCountry(tax.getCustCountry());
			result.setCustId(tax.getCustId());
			result.setCustState(tax.getCustState());
			result.setInvoiceDate(tax.getInvoiceDate());
			result.setCustZipCode(tax.getCustZipCode());
			result.setItemDescription(tax.getItemDescription());
			result.setProductCode(tax.getProductCode());
			result.setCustCity(tax.getCustCity());
			result.setCustName(tax.getCustName());
		}

		return ResponseEntity.ok(result);

	}

}
