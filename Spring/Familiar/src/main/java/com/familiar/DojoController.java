package com.familiar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class DojoController {

	@RequestMapping("/{url}")
	public String dojo (@PathVariable ("url") String url) {
		if(url.equals("dojo")) {
			return "The dojo is awesome!";
		}
		if (url.equals("burbank-dojo")) {
			return "Burbank dojo is located in Southern California";
		}
		if (url.equals("san-jose")) { 
			return "SJ dojo is the headquarters";
		}
		return "Url not found...";
	}
}					