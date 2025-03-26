package com.fmc.classes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.config.ProjectConfig;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		var vehicle =  context.getBean(Vehicle.class);
		System.out.println(vehicle.getName());
	}
}
