package com.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public double getTax(double tax, double value) {

		return calculateTax(tax, value);
	}

	double calculateTax(double taxPercentage, double value) {
		return (value * taxPercentage) / 100;

	}
}
