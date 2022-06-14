package com.dannycho.simple_receipt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        
        String name = "Elon Musk";
        String itemName = "Doge Coins";
        double price = 0.07516;
        String description = "Joy and tear of many";
        String vendor = "Doge Factory";
    
    	model.addAttribute("name", name);
    	model.addAttribute("itemName", itemName);
    	model.addAttribute("price", price);
    	model.addAttribute("description", description);
    	model.addAttribute("vendor", vendor);
    	
        return "index.jsp";
    }
}
