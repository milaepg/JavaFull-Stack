package com.camila.introspringboot.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping("")
		public String rutaRaiz() {
		return "Hello client! How are you doing?";
	}
	@RequestMapping("/random")
	public String mensaje() {
	return "Spring Boot is a great! So easy to just respond with strings";
}

}
