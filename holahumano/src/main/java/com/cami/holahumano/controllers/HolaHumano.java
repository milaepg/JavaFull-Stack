package com.cami.holahumano.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HolaHumano {
	@RequestMapping("/")
	public String index(@RequestParam(value = "name", required = false) String buscarConsulta, Model model) {
		if(buscarConsulta != null) {
			model.addAttribute("name", buscarConsulta);
			return "/Humano/index.jsp";
		}
		
		else
			
			model.addAttribute("name", "Human");
			return "/Humano/index.jsp";
		}
	
	}

	


