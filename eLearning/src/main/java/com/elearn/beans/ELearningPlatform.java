package com.elearn.beans;

import com.elearn.interfaces.LearningMode;

public class ELearningPlatform {

	private LearningMode mode;

	public LearningMode getMode() {
		return mode;
	}

	public void setMode(LearningMode mode) {
		this.mode = mode;
	}

	@Override
	public String toString() {
		return "ELearningPlatform [mode=" + mode + "]";
	}
	
	public void startSession() {
		mode.startSession();
	}
	
	public void endSession() {
		mode.endSession();
	}
	
	public void calculateCompletionPercentage(int lessonsCompleted) {
		System.out.println("Completion Percentage : "+mode.calculateCompletionPercentage(lessonsCompleted)+"%");
	}
}
