package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.beans.Car;
import com.practice.beans.Engine;
import com.practice.beans.MusicSystem;
import com.practice.config.ProjectConfig;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		
		Car car = context.getBean(Car.class);
		car.startCar();
		
		MusicSystem msystem = context.getBean(MusicSystem.class);
		car.changeMusicSystem(msystem);
		
		car.startCar();
	}
}
