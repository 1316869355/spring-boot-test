package com.test.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@RequestMapping("/test")
public class HelloController {
	
	@RequestMapping("/hello")
	public String index() {
		System.out.println("hello world");
		return "index";
	}
	@RequestMapping("/main")
	public String tomain(ModelMap map) {
		map.addAttribute("host", "http://blog.didispace.com");
		return "main";
	}
}
