package com.example.demo;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@RequestMapping("/")
	public String index(
			@RequestParam(value="firstName", required=false, defaultValue="human") String firstName,
			@RequestParam(value="lastName", required=false, defaultValue="") String lastName,
			@RequestParam(value="time", required=false, defaultValue="") String numTimesStr) {
		String result;
		if (!lastName.isEmpty()) {
			result = "Hello " + firstName + " " + lastName + " ";
		} else {
			result = "Hello " + firstName + " ";
		}
		
		if (!numTimesStr.isEmpty()) {
			int numTimes = Integer.parseInt(numTimesStr);
			return String.join("", Collections.nCopies(numTimes, result));
		} else {
			return result;
		}
		
	}

}
