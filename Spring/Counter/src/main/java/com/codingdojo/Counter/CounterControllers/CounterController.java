package com.codingdojo.Counter.CounterControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	int count;
	@RequestMapping("/")
	public String main(HttpSession countSession) {
		if(countSession.getAttribute("count")==null) {
			count = 0;
			countSession.setAttribute("count", count);
		}
		count +=1;
		countSession.setAttribute("count", count);
		return "index.jsp";
	}

	@RequestMapping("/counter")
	public String display(HttpSession countSession) {
		if(countSession.getAttribute("count")==null) {
			count = 0;
			countSession.setAttribute("count", count);
		}
		return "counter.jsp";
	}
	@RequestMapping("/doubleCount")
	public String doubleCount(HttpSession countSession) {
		if(countSession.getAttribute("count")==null) {
			count = 0;
			countSession.setAttribute("count", count);
		}
		count +=2;
		countSession.setAttribute("count", count);
		return "doubleCount.jsp";
	}
	@RequestMapping("/reset")
	public String reset(HttpSession countSession) {
		countSession.removeAttribute("count");
		return "redirect:/counter";
	}
}
