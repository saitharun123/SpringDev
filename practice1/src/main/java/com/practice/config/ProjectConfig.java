package com.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.beans.Car;
import com.practice.beans.Engine;

@Configuration
@ComponentScan("com.practice")
public class ProjectConfig {

	@Bean
	public Car car1() {
		Car car1 = new Car(new Engine(), "Ferrari");
		return car1;
	}
}
