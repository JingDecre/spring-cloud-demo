package com.decre.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Service0Application {

	@GetMapping("/service0")
	public String service0() {
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(Service0Application.class, args);
	}
}
