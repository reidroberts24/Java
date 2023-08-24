package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@SpringBootApplication
@Controller
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@RequestMapping("/")
    public String index(HttpSession session) {
        Integer count = (Integer) session.getAttribute("count");
        
        if (count == null) {
            count = 0;
        }
        
        count++;
        
        session.setAttribute("count", count);
        
        return "welcome.jsp"; // Redirect to /counter after incrementing the count.
    }
	
	@RequestMapping("/counter")
    public String displayCount(HttpSession session) {
        return "counter.jsp"; // Display the counter.jsp
    }
	

}
