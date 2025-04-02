package com.elearn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.elearn.beans.ELearningPlatform;
import com.elearn.impl.InteractiveQuiz;
import com.elearn.impl.LiveSession;
import com.elearn.impl.VideoMode;

@Configuration
public class ProjectConfig {

	@Bean
	@Primary
	public ELearningPlatform platform() {
		ELearningPlatform platform = new ELearningPlatform();
		platform.setMode(new VideoMode());
		return platform;
	}
	
	@Bean(name = "quizmode")
	public ELearningPlatform quizMode() {
		ELearningPlatform platform = new ELearningPlatform();
		platform.setMode(new InteractiveQuiz());
		return platform;
	}
	
	@Bean(value = "livemode")
	public ELearningPlatform liveMode() {
		ELearningPlatform platform = new ELearningPlatform();
		platform.setMode(new LiveSession());
		return platform;
	}
}
