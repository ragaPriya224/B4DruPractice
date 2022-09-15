package com.drucare.druSpringBootDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drucare.druSpringBootDemo.service.HelloService;

@RestController
public class HelloController {

	@Autowired
	HelloService helloService;
	
	@RequestMapping("/hello")
	public String sayHello() {
		return helloService.sayHello();
	}
}
