package com.gwozdz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.gwozdz.services.CalculatorService;

@Controller
public class AdditionController {
	

	
private CalculatorService calculatorServiceAddition;
	
	
	@Autowired
	@Qualifier("calculatorServiceAddition")
	public void setCalculatorServiceAddition(CalculatorService calculatorServiceAddition) {
		this.calculatorServiceAddition = calculatorServiceAddition;
	}

	
	public double getResult(long x, long y){	
		double result = calculatorServiceAddition.calculate(x, y);
		System.out.println("calculatorServiceAddition result = [" + result + "]");
		return result;
	}
	
}
