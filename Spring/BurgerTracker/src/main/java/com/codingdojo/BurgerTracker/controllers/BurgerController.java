package com.codingdojo.BurgerTracker.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.BurgerTracker.models.Burgers;
import com.codingdojo.BurgerTracker.services.BurgerService;

import jakarta.validation.Valid;


@Controller
public class BurgerController {
	
	private final BurgerService burgerService;
	public BurgerController(BurgerService burgerService){
	    this.burgerService = burgerService;
	}
//	@Autowired
//	BurgerService burgerService;

	@GetMapping("/")
	public String main(@ModelAttribute("burger") Burgers burger, Model showModel) {
		List<Burgers> allBurgers = burgerService.allBurgers();
		showModel.addAttribute("allBurgers", allBurgers);
		return "index.jsp";
	}
	
	@PostMapping("/newBurger")
	public String create(@Valid@ModelAttribute("burger") Burgers burger, BindingResult result, Model showModel) {
		if (result.hasErrors()) {
			List<Burgers> allBurgers = burgerService.allBurgers();
			showModel.addAttribute("allBurgers", allBurgers);
			return "index.jsp";
		} else {
			burgerService.createBurger(burger);
			return "redirect:/";
		}
	}
	
	@GetMapping("/burgers/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Burgers burger = burgerService.findBurger(id);
		model.addAttribute("burger", burger);
		return "edit.jsp";
	}
	
	@PutMapping("/burgers/update/{id}")
	public String update(@PathVariable("id") Long id, @Valid@ModelAttribute("burger") Burgers burger, BindingResult result, Model showModel) {
		if (result.hasErrors()) {
			showModel.addAttribute("burger", burger);
			return "edit.jsp";
		} else {
			
			burgerService.updateBurger(burger);
			return "redirect:/";
		}
	}
}
