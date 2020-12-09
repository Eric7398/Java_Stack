package com.ninjagold;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaGoldController {
	
	ArrayList<String> events = new ArrayList<String>();
	Date date = new Date();
	Random random = new Random();
	
	@RequestMapping("/")
	public String home(HttpSession session, Model model) {
		Integer money = (Integer) session.getAttribute("money");
		model.addAttribute("events", events);
		
		if(money == null) {
			money = 0;
			session.setAttribute("money", money);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		events.clear();
		return "redirect:/";
	}

	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String process(@RequestParam String location, HttpSession session) {

		Integer money = (Integer) session.getAttribute("money");
		int m = 0;
		
		
		
		if (location.equals("farm")) {
			m = random.nextInt((10)+10);
			money += m;

		}
		
		
		if (location.equals("cave")) {
			m = random.nextInt((5)+5);
			money += m;
		}
		
		
		if (location.equals("house")) {
			m = random.nextInt((2)+3);
			money += m;
		}
		
		
		if (location.equals("casino")) {
			m = random.nextInt(50+50)-50;
			money += m;

		}
	
		
		if (m > 0) {
			events.add("<p style='color: green;'>You entered a " + location + " and earned " + m + " gold. (" + date + ")</p>");
		} else {
			events.add("<p style='color: red;'>You entered a casino and lost " + m + " gold. Ouch. (" + date + ")</p>");
		}

		

		session.setAttribute("money", money);
		
		return "redirect:/";
	}
	
}
