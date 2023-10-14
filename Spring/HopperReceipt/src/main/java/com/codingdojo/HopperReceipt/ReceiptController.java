package com.codingdojo.HopperReceipt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReceiptController {
	// class definition and imports here...
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Boob B";
        String itemName = "Fish";
        double price = 100.44;
        String description = "Ocean fish.";
        String vendor = "Bad fishing inc";
    
    	// Your code here! Add values to the view model to be rendered
        model.addAttribute("name", name);
        model.addAttribute("itemName", itemName);
        model.addAttribute("price", price);
        model.addAttribute("description", description);
        model.addAttribute("vendor", vendor);

        return "index.jsp";
    }
    //...
    
}
