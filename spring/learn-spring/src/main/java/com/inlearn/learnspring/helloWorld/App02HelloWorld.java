package com.inlearn.learnspring.helloWorld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorld {

	public static void main(String[] args) {

		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			System.out.println(context.getBean("human"));
//	System.out.println(context.getBean("myaddress  00"));
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}

}
