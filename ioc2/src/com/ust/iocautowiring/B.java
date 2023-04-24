package com.ust.iocautowiring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Qualifier;

public class B {
	A a;//default beanscope:singleton
	public B() {
		// TODO Auto-generated constructor stub
	}
	public B(A a) {
		this.a=a;
		System.out.println("from B() constructor");
	}
	@Qualifier("a")
	public void setA(A a) {//byName byType  will use setter injection
		System.out.println("setA() is called..");
		this.a=a;
	}
	@PostConstruct//treats like init
	public void setUp() {
		System.out.println("from setUp()...");
	}
	@PreDestroy
	public void windup() {
		System.out.println("from windup()...");
	}
	

}
