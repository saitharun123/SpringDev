package com.assign.impl;

import com.assign.interfaces.Speakers;

public class SonySpeaker implements Speakers {

	private final String speakerName = "Sony";
	
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
