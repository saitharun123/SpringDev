package com.carsim.beans;

import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {

	public void playMusic(){
		System.out.println("Music started playing...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Music stopped.");
	}
}
