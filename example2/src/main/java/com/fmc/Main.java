package com.fmc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.config.ProjectConfig;

public class Main {

	// Example 2,3,4 are included in this single project
	public static void main(String[] args) {
		ApplicationContext context  = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Vehicle vehicle = context.getBean("vehicle1",Vehicle.class);
		System.out.println("By method name : "+vehicle.getName());
		
		Vehicle vehicle2 = context.getBean("Honda car",Vehicle.class);
		System.out.println("By custom name : "+vehicle2.getName());
		
		Vehicle vehicle3 = context.getBean(Vehicle.class);
		System.out.println("By primary annotation : "+vehicle3.getName());
		
		Vehicle vehicle4 = context.getBean("Tata car",Vehicle.class);
		System.out.println("By value name : "+vehicle4.getName());
		
		Animal dog = context.getBean(Animal.class);
		dog.bark();
	}
}
