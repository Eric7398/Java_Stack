package com.lookify.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SongController {
	@GetMapping("/")
	public String welcome() {
		return "index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model model) {
		return "dashboard.jsp";
	}
}
