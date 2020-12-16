package com.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	public String name(@RequestParam(value="name", required=false) String fname) {
		if(fname == null) {
			return "<h1>Hello Human!</h1><p>Welcome to SpringBoot!</p>";
		}else {
			return "<h1>Hello " + fname + "!</h1><p>Welcome to SpringBoot!</p>";
		}
	}
}