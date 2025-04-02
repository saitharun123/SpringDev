package com.elearn.impl;

import com.elearn.interfaces.LearningMode;

public class LiveSession implements LearningMode{


	@Override
	public void startSession() {
		System.out.println("Live Mode session started");
		
	}

	@Override
	public void endSession() {
		System.out.println("Live Mode session ended");
		
	}

	@Override
	public double calculateCompletionPercentage(int lessonsCompleted) {
		double totalLessons = 50;
		double percent = ( lessonsCompleted/totalLessons) * 100;
		return percent;
	}


}
