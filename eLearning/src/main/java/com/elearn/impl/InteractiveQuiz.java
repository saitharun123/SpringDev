package com.elearn.impl;

import com.elearn.interfaces.LearningMode;

public class InteractiveQuiz implements LearningMode {


	@Override
	public void startSession() {
		System.out.println("Quiz Mode session started");
		
	}

	@Override
	public void endSession() {
		System.out.println("Quiz Mode session ended");
		
	}

	@Override
	public double calculateCompletionPercentage(int lessonsCompleted) {
		double totalLessons = 50;
		double percent = ( lessonsCompleted/totalLessons) * 100;
		return percent;
	}


}
