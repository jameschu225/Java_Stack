package com.codingdojo.SaveTravels.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.SaveTravels.models.Travel;
import com.codingdojo.SaveTravels.services.TravelService;

import jakarta.validation.Valid;

@Controller
public class TravelController {
	
	private final TravelService travelService;
	public TravelController(TravelService travelService){
	    this.travelService = travelService;
	}
	
	@GetMapping("/")
	public String main() {
		return "redirect:/expenses";
	}
	
	@GetMapping("/expenses")
	public String dashboard(@ModelAttribute("travel") Travel travel, Model showModel) {
		List<Travel> allTravels = travelService.allTravels();
		showModel.addAttribute("allTravels", allTravels);
		return "index.jsp";
	}
	
	@PostMapping("/newexpense")
	public String createExpense(@Valid@ModelAttribute("travel") Travel travel,
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute(travel);
			return "index.jsp";
		} else {
			travelService.createTravel(travel);
			return "redirect:/";
		}
	}
	
	@GetMapping("/expense/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		Travel travel = travelService.findTravel(id);
		model.addAttribute("travel", travel);
		return "edit.jsp";
	}
	
	@PutMapping("/expense/edit/{id}")
	public String update(Model model, 
			@Valid@ModelAttribute("travel") Travel travel, BindingResult result) {
		if(result.hasErrors()) {
			model.addAttribute(travel);
			return "edit.jsp";
		} else {
			travelService.updateTravel(travel);
			return "redirect:/";
		}
	}
	
	@DeleteMapping("/expenses/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		travelService.deleteTravel(id);
		return "redirect:/";
	}
	
	@GetMapping("/expenses/{id}")
	public String detail(@PathVariable("id") Long id, Model detailModel) {
		Travel travel = travelService.findTravel(id);
		detailModel.addAttribute("travel",travel);
		return "detail.jsp";
	}
}
