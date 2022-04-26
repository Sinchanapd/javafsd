package com.simplilearn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Cloud {

	@RequestMapping("/testme")
	public String info()
	{
		return "Application is successfully deployed on cloud";
	}
}
