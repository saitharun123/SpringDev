package com.fmc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fmc.beans.Person;
import com.fmc.beans.Vehicle;

@Configuration
@ComponentScan(basePackageClasses = {com.fmc.beans.Person.class, com.fmc.beans.Vehicle.class} )
public class ProjectConfig {

	@Bean
	Vehicle vehicle(){
		Vehicle vh = new Vehicle();
		vh.setName("Lamborghini");
		vh.setModel("GT 705");
		return vh;
		
	}
	
	@Bean
	Person person(Vehicle vehicle) {
		Person person = new Person();
		person.setName("Tharun");
		person.setVehicle(vehicle);
		
		return person;
	}
}
