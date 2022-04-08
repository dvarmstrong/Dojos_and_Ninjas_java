package com.dojosandninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.dojosandninjas.models.Dojo;
import com.dojosandninjas.models.Ninja;

public interface NinjaRepo extends CrudRepository<Ninja, Long> {
	
	List<Ninja> findAll();
	List<Ninja> findAllByDojo(Dojo dojo);

}
