package com.assign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.assign.beans.Person;
import com.assign.beans.Vehicle;
import com.assign.beans.VehicleService;
import com.assign.config.ProjectConfig;
import com.assign.impl.MichellinTyres;
import com.assign.impl.SonySpeaker;

public class Main {

	// This contains only Annotation based configuration with autowired
	// Java based config OVERRIDES Annotation based config if both beans have same name 
	// like java config bean name = vehicle and annotation config bean name = vehicle (default)
	public static void main(String[] args) {


		ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Person person = context.getBean(Person.class);
		
		
		System.out.println("I am "+person.getName()+" and I own a "+person.getVehicleOwned()); 
		
		person.getVehicleOwned().playMusic();
		person.getVehicleOwned().move();
		
		
	}
}
