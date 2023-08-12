package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	public static void main(String[] args) {
		SpringApplication.run(DaikichiController.class, args);
	}
	
	@RequestMapping("")
	public String index() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors.";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{city}")
	public String travelCity(@PathVariable("city") String cityName) {
		return "Congratulations! You will soon travel to " + cityName + "!";
	}
	
	@RequestMapping("/lotto/{num}")
	public String lotto(@PathVariable("num") int num) {
		String result;
		if (num % 2 == 0) {
			result = "You will take a grand journey in the near future, but be weary of tempting offers.";
		} else {
			result = "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		}
		return result;
	}
	
}
