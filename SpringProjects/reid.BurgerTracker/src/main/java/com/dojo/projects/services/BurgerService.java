package com.dojo.projects.services;

import java.util.List;
import java.util.Optional;

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
	 
	 public Burger findBurger(Long burgerId) {
		 Optional<Burger> optionalBurger = burgerRepository.findById(burgerId);
	     if(optionalBurger.isPresent()) {
	         return optionalBurger.get();
	     } else {
	         return null;
	     }
	 }
	 
	 public Burger updateBurger(Long burgerId, String burgerName, String restaurantName, Integer rating, String notes) {
		 Optional<Burger> optionalBurger = burgerRepository.findById(burgerId);
		 if (optionalBurger.isPresent()) {
			 Burger burger = optionalBurger.get();
			 burger.setBurgerName(burgerName);
			 burger.setRestaurantName(restaurantName);
			 burger.setRating(rating);
			 burger.setNotes(notes);
			 return burgerRepository.save(burger);
		 }
		 return null;
	 }
}
