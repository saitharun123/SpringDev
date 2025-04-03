package com.assign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.assign.beans.Person;
import com.assign.beans.Vehicle;
import com.assign.config.ProjectConfig;

public class Main {

	// This contains only java based configuration 
	public static void main(String[] args) {


		ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Person person = context.getBean(Person.class);
		
		Vehicle veh = context.getBean(Vehicle.class);
		System.out.println("I am from vehicle class "+veh.getVehicleName());
		System.out.println("I am "+person.getName()+" and I own a "+person.getVehicleOwned());
		person.getVehicleOwned().playMusic();
		person.getVehicleOwned().move();
		
		
	}
}
