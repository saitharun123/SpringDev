package com.fmc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fmc.classes.Vehicle;

@Configuration
public class ProjectConfig {

	@Bean
	public Vehicle getVehicle() {
		Vehicle vh = new Vehicle();
		vh.setName("Audi");
		return vh;
	}
}
