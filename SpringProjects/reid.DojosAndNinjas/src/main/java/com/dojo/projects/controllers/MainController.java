package com.dojo.projects.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojo.projects.models.Dojo;
import com.dojo.projects.models.Ninja;
import com.dojo.projects.services.DojoService;
import com.dojo.projects.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	@Autowired
	DojoService dojoService;
	
	@Autowired
	NinjaService ninjaService;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "index.jsp";
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "new_dojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String createNewDojo(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if (result.hasErrors()) {
			return "new_dojo.jsp";
		} else {
			dojoService.createDojo(dojo);
			return "redirect:/";
		}
	}
	
	@GetMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
	    Dojo dojo = dojoService.findDojo(id);
	    if (dojo != null) {
	        model.addAttribute("dojo", dojo);
	        model.addAttribute("ninjas", ninjaService.findNinjasByDojo(dojo));
	        return "show_dojo.jsp";
	    } else {
	        return "redirect:/";
	    }
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja(Model model) {
	    model.addAttribute("dojos", dojoService.allDojos());  // populate the dojos dropdown for ninja form
	    model.addAttribute("ninja", new Ninja());  // blank ninja model attribute for form binding
	    return "new_ninja.jsp";  // the jsp file for ninja creation
	}
	
	@PostMapping("/ninjas/new")
	public String createNewNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("dojos", dojoService.allDojos());  // populate the dojos dropdown if form has errors
			return "new_ninja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/";
		}
	}
	
    @GetMapping("/dojos/delete/{id}")
    public String deleteDojo(@PathVariable("id") Long id) {
        dojoService.deleteDojo(id);
        return "redirect:/";  // redirect to the main page after deletion
    }

}
