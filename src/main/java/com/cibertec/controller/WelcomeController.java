package com.cibertec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@GetMapping("/welcome")
	public String welcome() {
		//nombre de la pagina que quiero mostrar
		return "welcome";
	}
}
