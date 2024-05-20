package com.spring.boot.starter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@GetMapping("/hello")
	public String hello() {
		return "hello from spring starter";
	}
}
