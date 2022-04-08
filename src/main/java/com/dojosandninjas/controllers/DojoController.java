package com.dojosandninjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojosandninjas.models.Dojo;
import com.dojosandninjas.models.Ninja;
import com.dojosandninjas.services.DojoServices;
import com.dojosandninjas.services.NinjaService;

@Controller
public class DojoController {
	
	@Autowired
	private DojoServices dojos;
	@Autowired
	private NinjaService ninjas;
	
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		
		return "index.jsp";
	}
	
	@PostMapping("/dojos")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		
		Dojo newDojo = dojos.create(dojo);
		return "location.jsp";
	}
	
	@GetMapping("/dojos/{id}")
	public String allDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojos.find(id);
		model.addAttribute("dojo", dojo);
		
		return "location.jsp";
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja")Ninja ninja, Model model) {
		model.addAttribute("dojos", dojos.all());
		return "newNinja.jsp";
	}
	
	@PostMapping("/ninjas")
	public String createNinja(@ModelAttribute("ninija")Ninja ninja) {
		ninja = ninjas.create(ninja);
		return "redirect:/dojos/" + ninja.getDojo().getId();
	}
	
	
	
	}
	
	
	
	


