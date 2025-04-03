package com.assign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.assign.beans.Person;
import com.assign.beans.Vehicle;
import com.assign.beans.VehicleService;
import com.assign.config.ProjectConfig;
import com.assign.impl.MichellinTyres;
import com.assign.impl.SonySpeaker;

public class Main {

	// This contains only Annotation based configuration with autowired
	public static void main(String[] args) {


		ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Person person = context.getBean(Person.class);
		person.setName("Nivin Pauly");
//		person.getVehicleOwned().setVehicleName("TATA Nexon");
//		person.getVehicleOwned().setModelNo("EV");
//		VehicleService vserv = new VehicleService();
//		vserv.setSpeaker(new SonySpeaker());
//		vserv.setTyres(new MichellinTyres());
//		person.getVehicleOwned().setService(vserv);
	
		System.out.println("I am "+person.getName()+" and I own a "+person.getVehicleOwned()); 
		
		person.getVehicleOwned().playMusic();
		person.getVehicleOwned().move();
		
		
	}
}
