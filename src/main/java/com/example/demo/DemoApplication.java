package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping
	public List<Student> student() {
		return List.of(
				new Student(0L, "Myeongnam", "myeongnam@gmail.com", LocalDate.of(1962, Month.SEPTEMBER, 13), 60)
		);
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
