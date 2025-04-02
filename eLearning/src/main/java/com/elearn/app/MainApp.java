package com.elearn.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.elearn.beans.ELearningPlatform;
import com.elearn.config.ProjectConfig;
import com.elearn.impl.LiveSession;

public class MainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		ELearningPlatform platform = context.getBean("quizmode",ELearningPlatform.class);
		//platform.setMode(new LiveSession());
		platform.startSession();
		platform.endSession();
		platform.calculateCompletionPercentage(25);
	}
}
