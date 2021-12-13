package com.example.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication()
@RestController
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@GetMapping("/welcome")
		public String hello() {
		return "Hello Rachna";
	}

	@GetMapping("/welcomeN")
	public String getCustomGreeting(@RequestParam String name) {
		return "Hello " + name;
	}


}
