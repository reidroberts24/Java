package com.reid.projects.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

	@GetMapping("/books")
	public String index() {
		return "index.jsp";
	}
}
