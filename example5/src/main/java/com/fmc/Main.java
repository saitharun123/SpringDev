package com.fmc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fmc.beans.Vehicle;

public class Main {

	// contains XML Based configuration 
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Vehicle vh = context.getBean(Vehicle.class);
		
		System.out.println("Vehicle Name : "+vh.getName());
		System.out.println("Vehicle Model : "+vh.getModel());
	}
}
