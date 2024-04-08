package com.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cloud {
	@GetMapping(value="/cloud")
	public String cloud() {
		return "AWS CLOUD COMPUTING";
	}

}
