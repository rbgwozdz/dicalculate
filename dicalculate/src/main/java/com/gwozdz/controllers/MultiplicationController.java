package com.gwozdz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.gwozdz.services.CalculatorService;

@Controller
public class MultiplicationController {
	
	private CalculatorService calculatorServiceMultiplication;
	
	
	@Autowired
	@Qualifier("calculatorServiceMultiplication")
	public void setCalculatorServiceMultiplication(CalculatorService calculatorServiceMultiplication) {
		this.calculatorServiceMultiplication = calculatorServiceMultiplication;
	}

	
	public double getResult(long x, long y){	
		double result = calculatorServiceMultiplication.calculate(x, y);
		System.out.println("calculatorServiceMultiplication result = [" + result + "]");
		return result;
	}
	

}
