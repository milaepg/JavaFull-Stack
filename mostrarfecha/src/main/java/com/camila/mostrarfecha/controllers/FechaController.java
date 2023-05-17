package com.camila.mostrarfecha.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/inicio")
public class FechaController {
	
	@RequestMapping("/hola")
	
	public String bienvenida() {
		return "index.jsp";
	}
	
	

}
