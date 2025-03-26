package com.fmc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {com.fmc.beans.Person.class, com.fmc.beans.Vehicle.class} )
public class ProjectConfig {

}
