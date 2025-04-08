package com.carsim.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.carsim.beans.Car;
import com.carsim.config.ProjectConfig;

public class MainApp {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Car car = context.getBean(Car.class);
		car.setCarStart(true);
		car.start();
		car.stop();
	}
}
