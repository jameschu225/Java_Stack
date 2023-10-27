package com.codingdojo.Omikuji.Controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class OmikujiContorller {
	@RequestMapping("/Omikuji")
	public String main(Model model) {
		ArrayList<String> years = new ArrayList<String>();
		for(int i=5; i<=25; i++) {
			years.add(Integer.toString(i));
		}
		model.addAttribute("years", years);
		return "index.jsp";
	}
	@RequestMapping(value="/decode", method=RequestMethod.POST)
	public String decode(@RequestParam(value="number") String number,
		@RequestParam(value="city") String city,
		@RequestParam(value="person") String person,
		@RequestParam(value="hobby") String hobby,
		@RequestParam(value="livingthing") String livingthing,
		@RequestParam(value="saying") String saying, HttpSession OmikujiSession){
		
		OmikujiSession.setAttribute("number", number);
		OmikujiSession.setAttribute("city", city);
		OmikujiSession.setAttribute("person", person);
		OmikujiSession.setAttribute("hobby", hobby);
		OmikujiSession.setAttribute("livingthing", livingthing);
		OmikujiSession.setAttribute("saying", saying);

	return "redirect:/Omikuji/show";
	}
	@RequestMapping("/Omikuji/show")
	public String show() {
		return "show.jsp";
	}
}
