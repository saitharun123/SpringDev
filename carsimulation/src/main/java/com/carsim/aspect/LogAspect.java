package com.carsim.aspect;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LogAspect {
	private Logger logger = Logger.getLogger(LogAspect.class.getName());
	private  Instant startTime;
	private  Instant endTime;
	
	@Around("execution(* com.carsim.beans.MusicPlayer.*(..))")
	public void logger(ProceedingJoinPoint joinpoint) throws Throwable {
		logger.info(joinpoint.getSignature().toString()+" Method Execution started");
		Instant methodStartTime = Instant.now();
		
		joinpoint.proceed();
		Instant methodendTime = Instant.now();
		logger.info(joinpoint.getSignature().toString()+" Method Execution ended ");
		
		long timeElapsed = Duration.between(methodStartTime, methodendTime).toSeconds();
		logger.log(Level.SEVERE,"Total duration of music played in Seconds : "+timeElapsed);
	}
	
	@Before(value = "execution(* com.carsim.beans.Car.start(..)) ")
	public void beforeLogger(JoinPoint joinPoint) {
		logger.info(joinPoint.getSignature().toString()+" Method Execution started");
		startTime = Instant.now();
		
	}
	
	@After(value = "execution(* com.carsim.beans.Car.stop(..)) ")
	public void afterLogger(JoinPoint joinPoint) {
		
		endTime = Instant.now();
		logger.info(joinPoint.getSignature().toString()+" Method Execution ended");
		

		long timeElapsed = Duration.between(startTime, endTime).toSeconds();
		logger.log(Level.SEVERE,"Total duration of drive in Seconds : "+timeElapsed);
	}
}
