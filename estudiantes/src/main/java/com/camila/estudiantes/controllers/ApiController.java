package com.camila.estudiantes.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.camila.estudiantes.models.Direccion;
import com.camila.estudiantes.models.Estudiante;
import com.camila.estudiantes.services.ApiService;

@RestController
public class ApiController {

	private final ApiService apiService;

	@Autowired
	public ApiController(ApiService apiService) {
		this.apiService = apiService;
	}

	@PostMapping("/students/create")
	public Estudiante createEstudiante(@RequestParam String firstName, @RequestParam String lastName,
			@RequestParam int age) {
		return apiService.createEstudiante(firstName, lastName, age);
	}

	@PostMapping("/contacts/create")
	public Direccion createDireccion(@RequestParam Long student, @RequestParam String address,
			@RequestParam String city, @RequestParam String state) {
		return apiService.createDireccion(student, address, city, state);
	}

	@GetMapping("/students")
	public List<Estudiante> getAllStudents() {
		return apiService.getAllStudents();
	}

}
