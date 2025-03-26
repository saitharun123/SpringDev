package com.fmc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.fmc.Animal;
import com.fmc.Cat;
import com.fmc.Dog;
import com.fmc.Vehicle;

@Configuration
public class ProjectConfig {

	@Primary
	@Bean
	Vehicle vehicle1() {
		Vehicle vh = new Vehicle();
		vh.setName("Audi 8");
		return vh;
	}
	
	@Bean(name = "Honda car") // 
	Vehicle vehicle2() {
		var vh = new Vehicle();
		vh.setName("Honda civic");
		return vh;
	}
	
	@Bean(value = "Tata car")
	Vehicle vehicle3() {
		var vh = new Vehicle();
		vh.setName("Tata Nexon");
		return vh;
	}
	
	@Bean("Suzuki car")
	Vehicle vehicle4() {
		var vh = new Vehicle();
		vh.setName("Maruti Suzuki");
		return vh;
	}
	
	@Bean
	Animal soundOfCat() {
		Cat cat = new Cat();
		return cat;
	}
	
	@Bean
	@Primary
	Dog soundOfDog() {
		Dog dog = new Dog();
		return dog;
	}
	
}
