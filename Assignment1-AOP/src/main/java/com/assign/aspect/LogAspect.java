package com.assign.aspect;

import java.time.Duration;
import java.time.Instant;
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
	private Instant startTime;
	private Instant endTime;
	
	@Around("execution(* com.assign.service.*.*(..))")
	public Object printLogger(ProceedingJoinPoint joinPoint) throws Throwable {
		
		logger.info(joinPoint.getSignature().toString()+" Method execution started ");
		Instant startTime = Instant.now();
		
		logger.info("Method Execution started ");
		
		Object music = joinPoint.proceed();
		
		Instant endTime = Instant.now();
		logger.info("Method execution ended");
		long timeElapsed = Duration.between(startTime, endTime).toMillis();
		
		logger.info("Time taken to execute the method in Millisec : "+timeElapsed);
		
		return music;
	}
	
//	@Before("execution(* com.assign.service.*.*(..))")
//	public void beforeLogger(JoinPoint joinPoint) {
//		logger.info(joinPoint.getSignature().toString()+" Method execution started ");
//		startTime = Instant.now();
//		
//		logger.info("Method Execution started ");
//	}
//	
//	@After("execution(* com.assign.service.*.*(..))")
//	public void afterLogger(JoinPoint joinPoint) {
//		endTime = Instant.now();
//		
//		logger.info("Method Execution Ended ");
//		
//		long timeElapsed = Duration.between(startTime, endTime).toMillis();
//		
//		logger.info("Time taken to execute the method in Millisec : "+timeElapsed);
//	}
	
}
