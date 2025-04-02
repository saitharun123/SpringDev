package com.practice.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private String name;
	private Engine engine;
	
	@Autowired
	public Car(Engine engine) {
		super();
		this.engine = engine;
		this.name = "Default car";
	}


	public Car(Engine engine, String name) {
		super();
		this.name = name;
		this.engine = engine;
	}
	
	public void start() {
		System.out.println(name+" is started ! ");
		engine.run();
	}
	
}
