package com.drucare.druSpringBootDemo.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	public String sayHello() {
		return "welcome user";
	}
}