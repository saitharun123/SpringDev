package com.assign.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.assign.interfaces.Speakers;

@Primary
@Component
public class BoseSpeaker implements Speakers{

	private final String speakerName = "Bose";
	@Override
	public void makeSound() {
		System.out.println("Playing music with "+speakerName);
	}
	
	public String getSpeakerName() {
		return speakerName;
	}

	@Override
	public String toString() {
		return speakerName;
	}
	

}
