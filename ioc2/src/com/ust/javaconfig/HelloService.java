package com.ust.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class HelloService {
	@Autowired//no need of constructor and getter setter
	HelloWorldImpl hello;
	void callHello() {
		hello.message();
	}
	

}
