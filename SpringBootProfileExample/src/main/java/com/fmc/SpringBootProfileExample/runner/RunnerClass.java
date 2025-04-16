package com.fmc.SpringBootProfileExample.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
@ConfigurationProperties("my.profile")
public class RunnerClass implements CommandLineRunner {

	private String code;
	private String server;
	private boolean inUse;
	
	@Override
	public String toString() {
		return "RunnerClass [code=" + code + ", server=" + server + ", inUse=" + inUse + "]";
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getServer() {
		return server;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public boolean isInUse() {
		return inUse;
	}

	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(this.toString());
		
	}

/* properties decided to be run is done by two ways
 * 				-- using commandLineArguments
 * 				-- using @Profile
 * 
 * --using CommandLineArguments
 * 		- In commandline arguments pass the property " spring.profiles.active=qa " and run it.
 * 		- the profile will be set as "qa" and properties are fetched from application-qa.properties.
 * 
 * --using @Profile
 * 		- In default application.properties set property " spring.profiles.active=qa " 
 * 		- By default without @Profile also works for this because the profile got selected from properties file.
 * 		- But it is recommended to keep @Profile("qa") on the top of the class as there will be multiple classes which needs to be run on different profiles.
 * 		
 * Misc Scenarios
 * 			- When @Profile("qa") and " spring.profiles.active=qa " in properties file then app runs normally.
 * 			- When @Profile("qa") and " spring.profiles.active=prod " in properties file then app does not run.
 * 
 *			(	Command Line Arguments always overrides application.properties in setting profile ) 
 * 			- When CLA is " spring.profiles.active=qa " no active profile set in properties file then app runs on "qa" profile.
 * 			- When CLA is " spring.profiles.active=qa " and active profile set to "prod" in properties file then app runs on "qa" profile.
 * 			- When CLA is " spring.profiles.active=qa " and @Profile("qa") and active profile set to "prod" in properties file then app runs on "qa" profile.
 * 			- When CLA is " spring.profiles.active=qa " and @Profile("prod") and active profile set to "prod" in properties file then app does not run.
 * 
 * @Profile("qa") will work only when " spring.profiles.active=qa " property exist in application.properties
 * 
 * Spring prefers application.properties over application.yml
 */
}
