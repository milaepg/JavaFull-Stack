package com.camila.enrutamientocadenas.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class DojoController {
	@RequestMapping("{location}")
	public String dojo(@PathVariable("location")String location){
		if(location.equals("dojo")) {
			return "!El Dojo es increíble!";
		}
		if(location.equals("burkan-dojo")) {
			return "El Dojo Burkan está localizado al sur de Califronia";
		}
		if(location.equals("san-jose")) {
			return "El Dojo SJ es el cuartel general";
		}
		return "*";
	}
	
}
