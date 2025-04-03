package com.assign.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.assign.beans.Person;
import com.assign.beans.Vehicle;
import com.assign.beans.VehicleService;
import com.assign.impl.BoseSpeaker;
import com.assign.impl.BridgeStoneTyres;
import com.assign.impl.MichellinTyres;
import com.assign.impl.SonySpeaker;

@Configuration
public class ProjectConfig {

	@Bean
	public Person person() {
		
		Person person = new Person();
		
		person.setName("Tharun");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("Ferrari");
		vehicle.setModelNo("R 35");
		
		VehicleService vserv = new VehicleService();
		vserv.setSpeaker(new SonySpeaker());
		vserv.setTyres(new BridgeStoneTyres());
		
		vehicle.setService(vserv);
		
		person.setVehicleOwned(vehicle);
		return person;
	}
	
	@Bean
	public Vehicle vehicle() {
		Vehicle veh = new Vehicle();
		
		veh.setVehicleName("Lamborghini");
		veh.setModelNo("Speed");
		
		VehicleService vserv = new VehicleService();
		vserv.setSpeaker(new BoseSpeaker());
		vserv.setTyres(new MichellinTyres());
		
		veh.setService(vserv);
		return veh;
	}
}
