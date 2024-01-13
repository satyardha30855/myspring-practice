package com.inlearn.learnspring.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(int age, String name) {
};

record Address(String line, String city) {
};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "SATYARDHA";
	}

	@Bean
	public int age() {
		return 21;
	}

	@Bean
	public String address() {
		return "VIJAYAWADA";
	}

	@Bean
	Person human() {
		return new Person(21, "satyardha14");
	}

	@Bean
	Address myaddress() {
		return new Address("VIJAYAWADA", "---VADDESWARAM");
	}

}
