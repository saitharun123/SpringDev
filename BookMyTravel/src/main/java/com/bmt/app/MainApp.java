package com.bmt.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bmt.beans.BookMyTravel;
import com.bmt.config.ProjectConfig;
import com.bmt.impl.Taxi;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		BookMyTravel bmt = context.getBean(BookMyTravel.class);
		bmt.setTransportMode(new Taxi());
		bmt.start();
		bmt.stop();
		System.out.println("The "+bmt.getTransportMode()+ " fare  is "+bmt.calculatingFare(50));
		
		context.close();
		
	}
}
