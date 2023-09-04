package com.dojo.projects.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.projects.models.Expense;
import com.dojo.projects.repositories.ExpenseRepository;
@Service
public class ExpenseService {
	@Autowired
	private ExpenseRepository expenseRepository;
	
	public ExpenseService(ExpenseRepository expenseRepository) {
		this.expenseRepository = expenseRepository;
	}
	
	public List<Expense> allExpenses() {
		return expenseRepository.findAll();
	}
	
	public Expense findExpense(Long expenseId) {
		Optional<Expense> optionalExpense = expenseRepository.findById(expenseId);
		if (optionalExpense.isPresent()) {
			return optionalExpense.get();
		} else {
			return null;
		}
	}
	
	public Expense update(Long id, String item, String vendor, String description, double amount) {
		Optional<Expense> optionalExpense = expenseRepository.findById(id);
		if (optionalExpense.isPresent()) {
			Expense expense = optionalExpense.get();
			expense.setItem(item);
			expense.setAmount(amount);
			expense.setDescription(description);
			expense.setVendor(vendor);
			expenseRepository.save(expense);
			return expense;
		} else {
			return null;
		}	}
	
	public Expense createExpense(Expense e) {
		return expenseRepository.save(e);
	}
	
	public void deleteExpense(Long expensId) {
		expenseRepository.deleteById(expensId);
	}
}
