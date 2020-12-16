package com.dojo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.dojo.models.Dojo;
import com.dojo.models.Ninja;
import com.dojo.services.DojoService;
import com.dojo.services.NinjaService;

@Controller
public class MainController {
	
	@Autowired
	private DojoService dojoService;
	
	@Autowired
	private NinjaService ninjaService;
	
	@GetMapping("/")
	public String allDojos(Model model) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "index.jsp";
	}
	
	
	@GetMapping("/createDojo")
	public String createPage(@ModelAttribute("dojo") Dojo dojo) {
		return "newDojo.jsp";
	}
	
	
	@PostMapping("/createDojo")
	public String createDojoCreate(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "newDojo.jsp";
		}
		dojoService.save(dojo);
			return "redirect:/";
	}
	
	@GetMapping("/createNinja")
	public String showNinjaCreate(@ModelAttribute("ninja") Ninja ninja, Model model) {
		model.addAttribute("dojos", dojoService.allDojos());
		return "newNinja.jsp";
	}
	
	@PostMapping("/createNinja")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "newNinja.jsp";
		}
		ninjaService.save(ninja);
		return "redirect:/";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
