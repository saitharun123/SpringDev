package com.assign.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.assign.beans.Vehicle;

@Configuration
@ComponentScan("com.assign")
@EnableAspectJAutoProxy
public class ProjectConfig {

	
	  @Bean 
	  public Vehicle vehicle() {
	  
	  Vehicle veh= new Vehicle();
	  veh.setVehicleName("Audi");
	  veh.setModelNo("276");
	  return veh; 
	  }
	 

}
