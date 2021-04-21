package com.springMVCLearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SisterController {
	
	@ResponseBody
	@GetMapping("/book")
	public String giveSugar() {
		return "Here is your book";
	}

}
