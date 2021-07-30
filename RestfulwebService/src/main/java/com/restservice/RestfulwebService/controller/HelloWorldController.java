package com.restservice.RestfulwebService.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restservice.RestfulwebService.bean.HelloWorldBean;

//@Controller
@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class HelloWorldController {
	@GetMapping(path="/hello-world")
	public String Helloworld()
	{
		return "Hello world";
	}
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloworldBean()
	{
		return new HelloWorldBean("hello world bean");
		//throw new  RuntimeException("Some error has occureed..Please contact the support team...!");
	}	//passsing data from the uri

	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloworld(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("Hello world, %s",name));
	}

}
