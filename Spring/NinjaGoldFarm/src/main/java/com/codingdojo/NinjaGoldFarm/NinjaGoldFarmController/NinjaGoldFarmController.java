package com.codingdojo.NinjaGoldFarm.NinjaGoldFarmController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class NinjaGoldFarmController {
	@RequestMapping("/")
	public String main(HttpSession goldSession) {
		if (goldSession.getAttribute("gold")== null) {
			int gold = 0;
			goldSession.setAttribute("gold", gold);
			return "index.jsp";
		}
		return "index.jsp";
	}
	@RequestMapping(value="/action", method=RequestMethod.POST)
	public String action(HttpSession goldSession, @RequestParam(value="action") String action, Model model) {
		ArrayList<String> activityMessage = new ArrayList<String>();
		activityMessage = (ArrayList<String>) goldSession.getAttribute("activityMessage");
		goldSession.setAttribute("activityMessage", activityMessage);
		String pattern = "EEEE, MMM-dd-yyyy hh:mm a";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		if (action.equals("Farm")) {
			int newGold = (int)goldSession.getAttribute("gold")+15;
			goldSession.setAttribute("gold", newGold);
			String date = simpleDateFormat.format(new Date());
			activityMessage.add("You entered a farm and earned 15 gold. "+ date);
			goldSession.setAttribute("activityMessage", activityMessage);
			return "redirect:/";
		}
		else if (action.equals("Cave")) {
			goldSession.setAttribute("gold", (int)goldSession.getAttribute("gold")+7);
			String date = simpleDateFormat.format(new Date());
			activityMessage.add("You entered a farm and earned 7 gold. " + date);
			goldSession.setAttribute("activityMessage", activityMessage);
		return "redirect:/";
		}
		else if (action.equals("House")) {
			goldSession.setAttribute("gold", (int)goldSession.getAttribute("gold")+5);
			String date = simpleDateFormat.format(new Date());
			activityMessage.add("You entered a farm and earned 5 gold. " + date);
			goldSession.setAttribute("activityMessage", activityMessage);
		return "redirect:/";
		}
		else if (action.equals("Quest")) {
			goldSession.setAttribute("gold", (int)goldSession.getAttribute("gold")+27);
			String date = simpleDateFormat.format(new Date());
			activityMessage.add("You entered a farm and earned 27 gold. " + date);
			goldSession.setAttribute("activityMessage", activityMessage);
		return "redirect:/";
		}
		return "redirect:/";
	}
}
