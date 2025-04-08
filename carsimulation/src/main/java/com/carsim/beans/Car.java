package com.carsim.beans;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.carsim.interfaces.Tyre;

@Component
public class Car {

	private Logger logger = Logger.getLogger(Car.class.getName());
	private Tyre tyres;
	private boolean carStart;
	@Autowired
	private MusicPlayer player;
	
	public Tyre getTyres() {
		return tyres;
	}
	
	@Autowired
	@Qualifier("MrfTyres")
	public void setTyres(Tyre tyres) {
		this.tyres = tyres;
	}
	public boolean isCarStart() {
		return carStart;
	}
	public void setCarStart(boolean carStart) {
		this.carStart = carStart;
	}
	
	public void start() {
		
		if(carStart) {
			tyres.rotate();
			player.playMusic();
		}else {
			logger.log(Level.SEVERE,"Music cannot be played as Car has not started yet");
		}
	}
	
	public void stop() {
		if(carStart) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Car stopped.");}
		else
		System.out.println("Car cannot be stopped as it has not yet started !");
	}
	
}
