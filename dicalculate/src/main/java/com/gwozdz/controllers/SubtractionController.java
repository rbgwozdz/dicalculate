package com.gwozdz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.gwozdz.services.CalculatorService;

@Controller
public class SubtractionController {
	
	private CalculatorService calculatorServiceSubtraction;
	
	
	@Autowired
	@Qualifier("calculatorServiceSubtraction")
	public void setCalculatorServiceAddition(CalculatorService calculatorServiceSubtraction) {
		this.calculatorServiceSubtraction = calculatorServiceSubtraction;
	}

	
	public double getResult(long x, long y){	
		double result = calculatorServiceSubtraction.calculate(x, y);
		System.out.println("calculatorServiceSubtraction result = [" + result + "]");
		return result;
	}
	

}
