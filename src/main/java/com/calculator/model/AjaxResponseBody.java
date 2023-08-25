package com.calculator.model;

public class AjaxResponseBody {

	private String msg;
	private double result;

	private Long custId;

	private String custName;

	private String productCode;

	private String itemDescription;

	private String invoiceDate;

	private double invoiceLineAmount;

	private String addressLine;

	private String custCity;

	private String custState;

	private String custZipCode;

	private String custCountry;

	public Long getCustId() {
		return custId;
	}

	public void setCustId(Long custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public String getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(String invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public double getInvoiceLineAmount() {
		return invoiceLineAmount;
	}

	public void setInvoiceLineAmount(double invoiceLineAmount) {
		this.invoiceLineAmount = invoiceLineAmount;
	}

	public String getAddressLine() {
		return addressLine;
	}

	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}

	public String getCustCity() {
		return custCity;
	}

	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}

	public String getCustState() {
		return custState;
	}

	public void setCustState(String custState) {
		this.custState = custState;
	}

	public String getCustZipCode() {
		return custZipCode;
	}

	public void setCustZipCode(String custZipCode) {
		this.custZipCode = custZipCode;
	}

	public String getCustCountry() {
		return custCountry;
	}

	public void setCustCountry(String custCountry) {
		this.custCountry = custCountry;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

}
