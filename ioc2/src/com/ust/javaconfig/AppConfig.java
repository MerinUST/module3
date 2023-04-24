package com.ust.javaconfig;

import org.springframework.context.annotation.Bean;

public class AppConfig {

	@Bean(name="helloworld")
	public HelloWorld getBean() {
		return new HelloWorldImpl();
	}
}
