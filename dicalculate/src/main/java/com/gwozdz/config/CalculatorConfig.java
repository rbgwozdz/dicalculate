package com.gwozdz.config;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.gwozdz.services.CalculatorFactory;
import com.gwozdz.services.CalculatorService;

@Configuration
public class CalculatorConfig {
	
	@Bean
	public CalculatorFactory calculatorFactory(){
		return new CalculatorFactory(); 
	}
	
	@Bean
	public CalculatorService calculatorServiceAddition(CalculatorFactory calculatorFactory){
		return calculatorFactory.createCalculatorService("+");
	}
	
	@Bean
	public CalculatorService calculatorServiceDivision(CalculatorFactory calculatorFactory){
		return calculatorFactory.createCalculatorService("/");
	}
	                        
	@Bean
	public CalculatorService calculatorServiceMultiplication(CalculatorFactory calculatorFactory){
		return calculatorFactory.createCalculatorService("*");
	}
	
	@Bean
	@Primary
	public CalculatorService calculatorServiceSubtraction(CalculatorFactory calculatorFactory){
		return calculatorFactory.createCalculatorService("-");
	}
	
	
}
