package com.codingdojo.DojoAndNinjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.DojoAndNinjas.models.Dojo;
import com.codingdojo.DojoAndNinjas.models.Ninja;
import com.codingdojo.DojoAndNinjas.services.DojoService;
import com.codingdojo.DojoAndNinjas.services.NinjaService;

@Controller
public class DojoController {


	@Autowired
	DojoService dojoService;

	@Autowired
	NinjaService ninjaService;
	
	@GetMapping("/")
	public String dashdoard(Model model) {
		List<Dojo> dojos = dojoService.findAllDojo();
		model.addAttribute("dojos", dojos);
		return "dashboard.jsp";
	}
	
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	
	@PostMapping("/dojos/new")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		dojoService.create(dojo);
		return "redirect:/";
	}
	
	@GetMapping("/dojos/{id}")
	public String detailDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojoService.findOneDojo(id);
		model.addAttribute("dojo", dojo);
		return "dojo.jsp";
	}
	
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoService.findAllDojo();
		model.addAttribute("dojos",dojos);
		return "newNinja.jsp";
	}
	
	@PostMapping("/ninjas/new")
	public String createNinja(@ModelAttribute("ninja") Ninja ninja) {
		ninjaService.create(ninja);
		return "redirect:/";
	}
}
