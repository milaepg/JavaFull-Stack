package com.camila.enrutamiento.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class Erutamiento {
	
	@RequestMapping("/coding")
	public String CodingController() {
	return "¡Hola Coding Dojo!";

}
	@RequestMapping("/coding/python")
	public String CodingControllerUno() {
	return "¡Python/Django fue increíble!";


}
	@RequestMapping("/coding/java")
	public String CodingControllerDos() {
	return "¡Java/Spring es mejor!";
}
}	