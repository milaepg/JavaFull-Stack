package com.camila.encuestadojo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EncuestaController {
	@RequestMapping("/")
	public String encuesta() {
		return "index.jsp";
	}

}
