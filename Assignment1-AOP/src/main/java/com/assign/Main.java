package com.assign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.assign.beans.Person;
import com.assign.beans.Song;
import com.assign.config.ProjectConfig;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Person person = context.getBean(Person.class);
		person.setName("Tharun");
		

		Song song = new Song();
		song.setArtistName("Jakes Bejoy");
		song.setSongName("Maate Vinadhuga");
		
		boolean vehicleStarted = true;
		System.out.println(person.getVehicleOwned().getService().playMusic(vehicleStarted,song));
		
	}
}
