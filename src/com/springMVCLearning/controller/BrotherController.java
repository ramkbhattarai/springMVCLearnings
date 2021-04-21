package com.springMVCLearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // this annotation is used to tell the spring to initialize the object of this class by the spring container
public class BrotherController {
	
	@ResponseBody // this anotation is used to return the return type as response
	@GetMapping("/cricketbat")
	public String giveSugar() {
		return "Here is your cricket bat";
	}

}
