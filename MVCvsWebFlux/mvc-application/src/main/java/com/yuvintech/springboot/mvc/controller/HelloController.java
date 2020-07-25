package com.yuvintech.springboot.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuvintech.springboot.mvc.service.HelloWorldService;

@RestController
public class HelloController {
	
	@Autowired
	private HelloWorldService helloService;

	
	@GetMapping("hi")
	public String sayHello() {
		return helloService.sayHello();
	}
}
