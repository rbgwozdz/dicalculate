package com.gwozdz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.gwozdz.services.CalculatorService;
import com.gwozdz.services.CalculatorServiceMultiplicationImpl;

@Controller
public class ResultController {
	
	private CalculatorService calculatorService;
	private CalculatorService calculatorServiceMultiplication;
	
	@Autowired
	public void setCalculatorService(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@Autowired
	@Qualifier("calculatorServiceMultiplication")
	public void setCalculatorServiceMultiplication(CalculatorService calculatorServiceMultiplication) {
		this.calculatorServiceMultiplication = calculatorServiceMultiplication;
	}

	
	public double getResult(long x, long y){	
		double result = calculatorService.calculate(x, y);
		System.out.println("result = [" + result + "]");
		System.out.println(calculatorServiceMultiplication.calculate(x, y));
		return result;
	}
	

}
