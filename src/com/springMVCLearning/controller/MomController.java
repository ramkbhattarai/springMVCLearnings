package com.springMVCLearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {
	
	@ResponseBody
	@GetMapping("/sugar")
	public String giveSugar() {
		return "Here is your sugar";
	}

}
