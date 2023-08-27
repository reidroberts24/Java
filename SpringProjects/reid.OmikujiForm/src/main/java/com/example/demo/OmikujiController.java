package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@SpringBootApplication
@Controller
@RequestMapping("/omikuji")

public class OmikujiController {
	public static void main(String[] args) {
		SpringApplication.run(OmikujiController.class, args);
	}
	
	@RequestMapping("")
	public String index(Model model) {
		model.addAttribute("omikuji", new Omikuji());
		return "index.jsp";
	}
	
    @RequestMapping(value="/submit", method = RequestMethod.POST)
    public String handleSubmit(
    	    @RequestParam("number") Integer number,
    	    @RequestParam("city") String city,
    	    @RequestParam("person") String person,
    	    @RequestParam("hobby") String hobby,
    	    @RequestParam("thing") String thing,
    	    @RequestParam("comment") String comment,
    	    HttpSession session) {

    	    // Create a new Omikuji object
    	    Omikuji omikuji = new Omikuji();

    	    // Manually set the values
    	    omikuji.setNumber(number);
    	    omikuji.setCity(city);
    	    omikuji.setPerson(person);
    	    omikuji.setHobby(hobby);
    	    omikuji.setThing(thing);
    	    omikuji.setComment(comment);
    	    System.out.println(omikuji.getNumber());
    	    // Add to model
    	    session.setAttribute("omikuji", omikuji);

    	    // Forward to the result page
    	    return "redirect:/omikuji/show";

    }
	
    @RequestMapping("/show")
    public String result(HttpSession session, Model model) {
        Omikuji omikuji = (Omikuji) session.getAttribute("omikuji");

        if (omikuji == null) {
            return "redirect:/omikuji";  
        }

        model.addAttribute("omikuji", omikuji);
        return "result.jsp";
    }
 
	
}
