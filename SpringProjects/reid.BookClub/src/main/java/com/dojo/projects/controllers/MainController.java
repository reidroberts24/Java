package com.dojo.projects.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojo.projects.models.LoginUser;
import com.dojo.projects.models.User;
import com.dojo.projects.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

@Controller
public class MainController {
	@Autowired
	private UserService userService;

	@GetMapping("/")
    public String index(Model model) {
        model.addAttribute("newUser", new User());
        model.addAttribute("newLogin", new LoginUser());
        return "login.jsp";
    }
	
	// logout and clear session data
	@GetMapping("/logout")
	 public String logout(HttpSession session) {
		 session.setAttribute("userId", null);
		 return "redirect:/";
	 }
	
	//home page dash board
	@GetMapping("/home")
	 public String welcome(Model model, HttpSession session) {
		 Long userId = (Long) session.getAttribute("userId");
		 if(userId==null) {
			 return "redirect:/";
		 }
		 User user = userService.findById(userId);
		 model.addAttribute("user",user);
		 return "homepage.jsp";
	 }
	@PostMapping("/register")
    public String register(@Valid @ModelAttribute("newUser") User newUser, 
            BindingResult result, Model model, HttpSession session) {
 
		userService.register(newUser, result);
        if(result.hasErrors()) {
            model.addAttribute("newLogin", new LoginUser());
            return "login.jsp";
        }
        session.setAttribute("userId", newUser.getId());
        return "redirect:/home";

    
    }
    
    @PostMapping("/login")
    public String login(@Valid @ModelAttribute("newLogin") LoginUser newLogin, 
            BindingResult result, Model model, HttpSession session) {
    	User user = userService.login(newLogin, result);
    	if(result.hasErrors()) {
            model.addAttribute("newUser", new User());
            return "login.jsp";
        }
    
        session.setAttribute("userId", user.getId());
    
        return "redirect:/home";

    }
    
    
    
    
   

}