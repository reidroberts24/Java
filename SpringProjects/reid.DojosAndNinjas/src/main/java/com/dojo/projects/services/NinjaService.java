package com.dojo.projects.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.projects.models.Dojo;
import com.dojo.projects.models.Ninja;
import com.dojo.projects.repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired
	NinjaRepository ninjaRepository;
	
	// returns all ninjas
	public List<Ninja> allNinjas() {
		return ninjaRepository.findAll();
	}

	// creates new ninja
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepository.save(ninja);
	}
	
	// finds ninja by ID
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
		if (optionalNinja.isPresent()) {
			return optionalNinja.get();
		} else {
			return null;
		}
	}
	
	
	// returns all ninjas
	public List<Ninja> findNinjasByDojo(Dojo dojo) {
	    return ninjaRepository.findByDojo(dojo);
	}

}
