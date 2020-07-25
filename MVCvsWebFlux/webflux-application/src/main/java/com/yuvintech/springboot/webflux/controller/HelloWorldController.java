package com.yuvintech.springboot.webflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yuvintech.springboot.webflux.service.HelloWorldService;

import reactor.core.publisher.Mono;

@RestController
public class HelloWorldController {
	
	@Autowired
	public HelloWorldService helloService;
	
	@GetMapping("hi")
	public Mono<String> helloWorld(){
		
		return helloService.sayHello();
		
		
	}

}
