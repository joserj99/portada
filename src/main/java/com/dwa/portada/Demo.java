package com.dwa.portada;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Demo {
	@GetMapping("/")
	public String portada() {
		return "portada";
	}
}
