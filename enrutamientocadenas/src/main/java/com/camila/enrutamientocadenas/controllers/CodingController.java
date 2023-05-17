package com.camila.enrutamientocadenas.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conding")
public class CodingController {
	
	@RequestMapping("")
	public String hello() {
		return "¡Hola Conding Dojo!";
	
}
	@RequestMapping("/python")
	public String python() {
		return "¡Python/Django fue incríble!";
	}
	@RequestMapping("/java")
	public String java() {
		return "¡Java/Spring es incríble!";
	}
	
}