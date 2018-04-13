package com.test.sample.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String index() {
		System.out.println("hello world");
		return "index";
	}
	@RequestMapping("/main")
	public String tomain() {
		System.out.println("main");
		return "main";
	}
}
