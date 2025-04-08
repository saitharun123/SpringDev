package com.assign;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.assign.beans.Song;
import com.assign.config.ProjectConfig;
import com.assign.service.VehicleService;

public class Main {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		

		VehicleService service = context.getBean(VehicleService.class);
		
//		Song song = context.getBean(Song.class);
		
		Song song = new Song();
		song.setArtistName("Jakes Bejoy");
		song.setSongName("Maate Vinadhuga");
		
		//service.setSong(song);
		
//		System.out.println(song.getSongName());
//		System.out.println("Song is "+service.getSong());
		
		boolean vehicleStarted = true;
		String currentMusic = service.playMusic(vehicleStarted,song);
		
		System.out.println("Music playing : "+currentMusic);
		
	}
}
