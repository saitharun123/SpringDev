package com.assign.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.assign.beans.Vehicle;

@Configuration
@ComponentScan("com.assign")
public class ProjectConfig {

	
	  @Bean 
	  public Vehicle vehicle() {
	  
	  Vehicle veh= new Vehicle();
	  veh.setVehicleName("Audi");
	  veh.setModelNo("276");
	  return veh; 
	  }
	 

}
