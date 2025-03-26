package com.fmc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.beans.Person;
import com.fmc.config.ProjectConfig;

public class Main {

	// contains HAS-A-Relationship between two classes with Autowired
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Person person = context.getBean(Person.class);
		
		System.out.println(person);
		//System.out.println("I am "+person.getName()+" and I own a "+person.getVehicle());
	}
}
