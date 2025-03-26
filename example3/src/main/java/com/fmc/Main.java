package com.fmc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.fmc.beans.Vehicle;
import com.fmc.config.ProjectConfig;

public class Main {

	// consists of Annotation Based configuration along with life-cycle Methods
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Vehicle vh = context.getBean(Vehicle.class);
		System.out.println(vh.getName() + " "+vh.getModel());
		System.out.println(vh.toString());
	}
}
