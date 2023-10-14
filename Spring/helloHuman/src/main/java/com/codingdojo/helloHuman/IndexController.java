package com.codingdojo.helloHuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	@RequestMapping("/")
	public String home(@RequestParam(value= "name", required = false) String name,
			@RequestParam(value= "lastname", required = false) String lastname,
			@RequestParam(value= "times", required = false) int times) {
		if (name == null && lastname== null) {
			return "Hello Human";
		}
		String result="";
		for (int i=0; i< times; i++) {
			result += "Hello " + name + " " +lastname + " ";
		}
		return result;			
	}
//	@RequestMapping("/{inputName}")
//	public String name(@PathVariable("inputName") String name) {
//		return "Hello " + name;
//	}
}
