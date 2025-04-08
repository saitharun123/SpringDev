package com.carsim.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.carsim")
@EnableAspectJAutoProxy
public class ProjectConfig {

}
