package com.gwozdz.services;

public class CalculatorServiceSubtractionImpl implements CalculatorService {

	@Override
	public double calculate(double x, double y) {
		double sum = x - y;
		return sum;
	}

}
