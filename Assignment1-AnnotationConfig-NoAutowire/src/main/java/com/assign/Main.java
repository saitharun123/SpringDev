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

	// This contains only Annotation based configuration without autowired
	public static void main(String[] args) {


		ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Person person = context.getBean(Person.class);
		Person person2 = context.getBean(Person.class);
		
		
		person.setName("Mithun");
		
		person2.setName("Ramya"); // Singleton scope for entire context 
		
		Vehicle veh = context.getBean(Vehicle.class);
		veh.setModelNo("Thar");
		veh.setVehicleName("Mahindra");
		
		VehicleService vserv = context.getBean(VehicleService.class);
		vserv.setSpeaker(new SonySpeaker());
		vserv.setTyres(new MichellinTyres());
		
		veh.setService(vserv);
		
		person.setVehicleOwned(veh);
		person2.setVehicleOwned(veh);

		System.out.println("I am "+person.getName()+" and I own a "+person.getVehicleOwned()); 
		// shows ramya as name as the object is of singleton scope so actually two persons were not created 
		//only one person is created and name got updated.
		
		
		System.out.println("This is "+person2); // shows ramya
		person.getVehicleOwned().playMusic();
		person.getVehicleOwned().move();
		
		
	}
}
