package com.dojo.projects.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojo.projects.models.Expense;
import com.dojo.projects.services.ExpenseService;

import jakarta.validation.Valid;

@Controller
public class ExpenseController {
	@Autowired
	private ExpenseService expenseService;
	
	@GetMapping("/")
	public String index() {
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses") 
	public String expenses(Model model) {
		List<Expense> allExpenses = expenseService.allExpenses();
	    model.addAttribute("expenses", allExpenses);
	    model.addAttribute("expense", new Expense());
		return "expenses.jsp";
	}
	@PostMapping("/addExpense")
	public String processForm(@Valid @ModelAttribute("expense") Expense expense, BindingResult result) {
	    if (result.hasErrors()) {
	        return "/expenses";
	    } else {
	    	expenseService.createExpense(expense);  
	    	return "redirect:/expenses";	    	
	    }
	}
	
	@GetMapping("/editExpense/{expenseId}")
	public String editExpense(Model model, @PathVariable("expenseId") Long expenseId) {
		Expense expense = expenseService.findExpense(expenseId);
		model.addAttribute("expense", expense);
		return "editExpenses.jsp";
	}
	
	@PostMapping("/editExpense/{expenseId}/submit")
	public String updateExpense(@PathVariable Long expenseId, @Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("expense", expense);
			return "redirect:/editExpense/{expenseId}";
		} else {
			expenseService.update(expenseId, expense.getItem(), expense.getVendor(), expense.getDescription(), expense.getAmount());
			return "redirect:/expenses";
		}
	}
	
	@GetMapping("/viewExpense/{expenseId}")
	public String showExpense(Model model, @PathVariable("expenseId") Long expenseId) {
		Expense expense = expenseService.findExpense(expenseId);
		model.addAttribute("expense", expense);
		return "showExpense.jsp";
	}
	@DeleteMapping("/deleteExpense/{expenseId}")
	public String deleteExpense(@PathVariable("expenseId") Long expenseId) {
		expenseService.deleteExpense(expenseId);
	    return "redirect:/expenses";

	}
}
