package com.spring.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//in oder to make spring based class we need to annotate with
//@controller and in order to get the response @responsebody Or
//we can use @RestController

@RestController
public class HelloWorldController {
	
	//here we need write the api for 
	//put,post,get,remove
	
	//in order to make rest api we use @GetMapping
	
	@GetMapping("/hello")
	public String HelloWorld() {
		
		return "Hello Surya!!!...";
	}

}
