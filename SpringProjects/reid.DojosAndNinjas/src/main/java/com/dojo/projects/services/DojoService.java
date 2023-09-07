package com.dojo.projects.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dojo.projects.models.Dojo;
import com.dojo.projects.repositories.DojoRepository;

@Service
public class DojoService {
	
	@Autowired
	DojoRepository dojoRepository;
    
	// returns all the dojos
	public List<Dojo> allDojos() {
		return dojoRepository.findAll();	
	}
	
	// creates new dojo
	public Dojo createDojo(Dojo dojo) {
		return dojoRepository.save(dojo);
	}
	
	// finds single dojo
	public Dojo findDojo(Long id) {
		Optional<Dojo> optionalDojo = dojoRepository.findById(id);
		if (optionalDojo.isPresent()) {
			return optionalDojo.get();
		} else {
			return null;
		}
	}
	
	// deletes existing dojo
	public void deleteDojo(Long id) {
        dojoRepository.deleteById(id);
    }

}
