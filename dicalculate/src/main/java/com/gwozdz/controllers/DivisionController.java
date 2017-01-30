package com.gwozdz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.gwozdz.services.CalculatorService;

@Controller
public class DivisionController {
	
	private CalculatorService calculatorServiceDivision;
	
	
	@Autowired
	@Qualifier("calculatorServiceDivision")
	public void setCalculatorServiceAddition(CalculatorService calculatorServiceDivision) {
		this.calculatorServiceDivision = calculatorServiceDivision;
	}

	
	public double getResult(long x, long y){	
		double result = calculatorServiceDivision.calculate(x, y);
		System.out.println("calculatorServiceDivision result = [" + result + "]");
		return result;
	}

}
