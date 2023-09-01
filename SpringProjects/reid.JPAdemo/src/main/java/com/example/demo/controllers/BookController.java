package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.models.Book;
import com.example.demo.services.BookService;

@Controller
public class BookController {
	
	@Autowired
	BookService bookService;
	@GetMapping("/books/{bookId}")
	public String show_book(Model model, @PathVariable("bookId") Long bookId) {
		System.out.println(bookId);
		Book book = bookService.findBook(bookId);
		
		List<Book> books = bookService.allBooks();
		model.addAttribute("books", books);
		
		model.addAttribute("book", book);
		return "show.jsp";
	}
}
