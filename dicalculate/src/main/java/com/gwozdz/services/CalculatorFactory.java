package com.gwozdz.services;


public class CalculatorFactory {
	public CalculatorService createCalculatorService(String operator) {
		CalculatorService calculatorService = null;
		
		switch (operator){
        case "+":
        	calculatorService = new CalculatorServiceAdditionImpl();
            break;
        case "/":
        	calculatorService = new CalculatorServiceDivisionImpl();
            break;
        case "*":
        	calculatorService = new CalculatorServiceMultiplicationImpl();
            break;
        case "-":
        	calculatorService = new CalculatorServiceSubtractionImpl();
            break;
        default: 
    }

		
		
		
		
		
		return calculatorService;
	}

	
}
