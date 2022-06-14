package com.dannycho.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String Home(HttpSession session) {
		
		if(session.getAttribute("count") == null) {
		session.setAttribute("count", 0);
		}
		
		else {
			Integer currentCount = (Integer) session.getAttribute("count");
			currentCount ++;
			session.setAttribute("count", currentCount);
		}
		
		return "index.jsp";
	}
	
	@RequestMapping("/counter") 
	public String Counter(HttpSession session, Model model) {
		
		model.addAttribute("displayedCount", session.getAttribute("count"));
		
		if(session.getAttribute("count") == null) {
		session.setAttribute("count", 0);
		}
		
		return "counter.jsp";
	}
	
	@RequestMapping("/reset")
	public String Reset(HttpSession session) {
		session.invalidate();
		return "index.jsp";
	}
}
