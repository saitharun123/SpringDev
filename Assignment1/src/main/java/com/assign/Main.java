package com.assign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.assign.beans.Person;
import com.assign.config.ProjectConfig;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Person person = context.getBean(Person.class);
		person.setName("Tharun");
		
		System.out.println("I am "+person.getName());
		System.out.println("I own "+person.getVehicleOwned().getVehicleName()+" "+person.getVehicleOwned().getModelNo());

		person.getVehicleOwned().move();
		person.getVehicleOwned().playMusic();
		
	}
}
