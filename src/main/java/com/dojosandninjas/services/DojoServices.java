package com.dojosandninjas.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dojosandninjas.models.Dojo;
import com.dojosandninjas.repositories.DojoRepo;



@Service
public class DojoServices {
	private final DojoRepo dojoRepo;
	
	public DojoServices(DojoRepo dojoRepo) {
		this.dojoRepo = dojoRepo;
	}
	
	 // returns all the dojo
    public List<Dojo> all() {
        return dojoRepo.findAll();
    }
    // creates a dojo
    public Dojo create(Dojo newObj) {
        return dojoRepo.save(newObj);
    }
    // retrieves a dojo
    public Dojo find(Long id) {
    	Optional<Dojo> optionalDojo = dojoRepo.findById(id);
    	if(optionalDojo.isPresent()) {
    		return optionalDojo.get();
    	} else {
    		return null;
    	}
    }
	
	
}
