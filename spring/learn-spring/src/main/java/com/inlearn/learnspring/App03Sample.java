package com.inlearn.learnspring;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03Sample {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(SampleConfig.class);
		
		System.out.println();
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
