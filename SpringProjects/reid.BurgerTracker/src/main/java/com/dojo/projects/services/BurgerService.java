package com.dojo.projects.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.projects.models.Burger;
import com.dojo.projects.repositories.BurgerRepository;

@Service
public class BurgerService {
	@Autowired
	private BurgerRepository burgerRepository;
	
	public BurgerService(BurgerRepository burgerRepository) {
		this.burgerRepository = burgerRepository;
	}
	
	public List<Burger> allBurgers() {
		return burgerRepository.findAll();
	}
	
	 public Burger createBurger(Burger b) {
	     return burgerRepository.save(b);
	 }
}
