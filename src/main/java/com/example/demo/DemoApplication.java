package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



//	@GetMapping
//	public List<String> hello() {
//		return List.of("Hello", "World");  // will return JSON ["Hello","World"]
//	}

//	@GetMapping
//	public String hello() {
//		return "Hello World";  // will get String "Hello World"
//	}

}
