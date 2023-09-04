package com.dojo.projects.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojo.projects.models.Burger;
import com.dojo.projects.services.BurgerService;

import jakarta.validation.Valid;

@Controller
public class BurgerController {
	@Autowired
	BurgerService burgerService ;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("burger", new Burger());
		model.addAttribute("burgers", burgerService.allBurgers());
		return "index.jsp";
	}
	
	@PostMapping("/addBurger")
	public String addBurger(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
		if (result.hasErrors()) {
	    System.out.println(result.getAllErrors());
	    return "redirect:/";
		} else {			
		burgerService.createBurger(burger);
		return "redirect:/";
		}
	}
	
	@GetMapping("/burgers/{burgerId}/edit")
	public String showBurger(Model model, @PathVariable("burgerId") Long burgerId) {
		Burger burger = burgerService.findBurger(burgerId);
        model.addAttribute("burger", burger);
		return "show.jsp";
	}
	
	@PostMapping("/burgers/{burgerId}")
	public String updateBurger(@PathVariable Long burgerId, @Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("burger", burger);
			return "redirect:/burgers/{burgerId}/edit";
		} else {
			burgerService.updateBurger(burgerId, burger.getBurgerName(), burger.getRestaurantName(), burger.getRating(), burger.getNotes());
			return "redirect:/";
		}
	}
}
