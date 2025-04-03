package com.assign.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.assign.beans.Person;
import com.assign.beans.Vehicle;

@Configuration
@ComponentScan(basePackages = "com.assign")
public class ProjectConfig {



	@Bean(value ="person") // default annotation config bean name also
	public Person person1() {
		
		Person per = new Person();
		per.setName("Nayan");
		return per;
	}
	
	//@Bean
	public Vehicle vehicle() {
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Audi");
		vehicle.setModelNo("Envy");
	
		return vehicle;
	}
}
