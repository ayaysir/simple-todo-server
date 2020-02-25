package com.springboot.simpletodo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {
	
	@RequestMapping("/")
	public String mainPage() {
		return "main-web";
	}
}
