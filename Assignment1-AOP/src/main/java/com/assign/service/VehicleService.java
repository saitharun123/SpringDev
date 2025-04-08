package com.assign.service;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.assign.beans.Song;
import com.assign.interfaces.Speakers;
import com.assign.interfaces.Tyres;

@Component("vehicleService")
public class VehicleService {

	private Logger logger = Logger.getLogger(VehicleService.class.getName());
	
	private Speakers speaker;
	
//	private Song song;

	private Tyres tyres;

	 @Autowired
	    public VehicleService(@Qualifier("BoseSpeaker") Speakers speaker) {
	        this.speaker = speaker;
	    }
	public Speakers getSpeaker() {
		return speaker;
	}

	public void setSpeaker(Speakers speaker) {
		this.speaker = speaker;
	}

	public Tyres getTyres() {
		return tyres;
	}

//	public Song getSong() {
//		return song;
//	}
//	
//	@Autowired
//	public void setSong(Song song) {
//		this.song = song;
//	}
	
	@Autowired
	@Qualifier("MichellinTyres")
	public void setTyres(Tyres tyres) {
		this.tyres = tyres;
	}

	@Override
	public String toString() {
		return "VehicleService [speaker=" + speaker + ", tyres=" + tyres + "]";
	}
	
	// Method Without Aspect 
//	public String playMusic(boolean vehicleStarted, Song song) {
//		Instant startTime = Instant.now();
//		logger.info("Method Execution started !");
//		
//		String music = null;
//		if(vehicleStarted) {
//			music = speaker.makeSound(song);
//		}else {
//			logger.log(Level.SEVERE,"Music cannot be played as vehicle has not started!");
//		}
//		
//		logger.info("Method Execution ended");
//		Instant endTime = Instant.now();
//		long timeElapsed = Duration.between(startTime, endTime).toMillis();
//		logger.info("Time taken to execute method in MilliSeconds: "+timeElapsed);
//		
//		return music;
//	}
//	
	public String playMusic(boolean vehicleStarted,Song song) {
		String music=null;
		if(vehicleStarted) {
			music = speaker.makeSound(song);
		}else {
			logger.log(Level.SEVERE,"Music cannot be played as vehicle has not started!");
		}
		System.out.println("Speaker is : "+speaker);
		System.out.println("Music in playMusic class : "+music);
		return music;
	}
}
