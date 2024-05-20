package com.spring.boot.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan 
public class StarterApp {

	public static void main(String[] args) {
		SpringApplication.run(StarterApp.class , args);
	}
}
