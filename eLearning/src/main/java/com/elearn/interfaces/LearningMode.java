package com.elearn.interfaces;

public interface LearningMode {

	void startSession();
	void endSession();
	double calculateCompletionPercentage(int lessonsCompleted);
}
