package com.thecode;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CodeController {
	
	@RequestMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	@RequestMapping(value="/process", method=RequestMethod.POST)
	public String codecheck(@RequestParam(value="code") String code, HttpSession session) {
		if (code.equals("bushido")) {
			session.setAttribute("success", true);
			return ("redirect:/success");
		} else {
			return ("redirect:/");
		}
	}
	
	@RequestMapping("/success")
	public String success(HttpSession session) {
		Boolean success = (Boolean) session.getAttribute("success");
		if (success) {
			return "code.jsp";
		}else {
			return "/";
		}
	}
	
}
