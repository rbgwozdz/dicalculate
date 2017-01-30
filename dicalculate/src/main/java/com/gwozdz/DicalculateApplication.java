package com.gwozdz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.gwozdz.controllers.AdditionController;
import com.gwozdz.controllers.DivisionController;
import com.gwozdz.controllers.MultiplicationController;
import com.gwozdz.controllers.ResultController;
import com.gwozdz.controllers.SubtractionController;

@SpringBootApplication
@ComponentScan("com.gwozdz")
public class DicalculateApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DicalculateApplication.class, args);
		
		AdditionController additionController = (AdditionController) ctx.getBean("additionController");
		additionController.getResult(10, 12);

		DivisionController divisionController = (DivisionController) ctx.getBean("divisionController");
		divisionController.getResult(10, 12);

		MultiplicationController multiplicationController = (MultiplicationController) ctx.getBean("multiplicationController");
		multiplicationController.getResult(10, 12);
		
		SubtractionController subtractionController = (SubtractionController) ctx.getBean("subtractionController");
		subtractionController.getResult(10, 12);
		
	}
}
