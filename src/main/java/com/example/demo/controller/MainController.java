package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String welcome() {
		return "<h2>Welcome to Docker Swarm</h2><p>This is a sample project</p>";
	}
}
