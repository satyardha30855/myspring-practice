package com.inlearn.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Persons(String name,int age) {};

@Configuration
public class SampleConfig {
	@Bean
	public String name()
	{
		return "Satyardha this is sample and this is under progress";
	}
	
	@Bean
	Persons me()
	{
		return new Persons("satyardha---||",25);
	}
	
}
