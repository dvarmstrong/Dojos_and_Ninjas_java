package com.dojosandninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dojosandninjas.models.Dojo;
import com.dojosandninjas.models.Ninja;
import com.dojosandninjas.repositories.NinjaRepo;

@Service
public class NinjaService {
	private final NinjaRepo ninjaRepo;
	
	public NinjaService(NinjaRepo ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	// returns all the ninja
    public List<Ninja> all() {
        return ninjaRepo.findAll();
    }
    // creates a book
    public Ninja create(Ninja ninja) {
        return ninjaRepo.save(ninja);
    }
    // retrieves a book
    public Ninja find(Long id) {
        Optional<Ninja> result = ninjaRepo.findById(id);
        if(result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }
    public List<Ninja> byDojo(Dojo dojo) {
    	return ninjaRepo.findAllByDojo(dojo);
    }
	
	

}
