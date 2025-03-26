package com.fmc;

import java.util.function.Supplier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import com.fmc.beans.Vehicle;
import com.fmc.config.ProjectConfig;

public class Main {

	// consists of Register Bean type of bean declaration
	public static void main(String[] args) {
		GenericApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Vehicle audi = new Vehicle();
		audi.setName("Audi");
		audi.setModel("Booster 8");
		
		Supplier<Vehicle> audiSupplier = () -> audi;
		
		 context.registerBean("audi",Vehicle.class,audiSupplier);
		
		Vehicle vh = context.getBean(Vehicle.class);
		System.out.println(vh.toString());
		context.close();
	}
}
