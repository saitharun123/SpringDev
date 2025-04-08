package com.fmc.AppRunner.runner;

import java.util.Arrays;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("From Application Runner");
		System.out.println(Arrays.asList(args.getSourceArgs()));
		System.out.println(args.getOptionNames());
		System.out.println(args.getNonOptionArgs());
		System.out.println(args.getOptionValues("stages"));
		System.out.println(args.containsOption("stage"));
		

		
	}

}
