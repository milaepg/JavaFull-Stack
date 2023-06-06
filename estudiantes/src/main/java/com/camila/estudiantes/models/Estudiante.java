package com.camila.estudiantes.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Estudiante {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private int edad;

	@OneToOne(mappedBy = "estudiante", cascade = CascadeType.ALL)
	private Direccion direccion;

	public void setNombre(String nombre2) {
		// TODO Auto-generated method stub
		
	}

	public void setApellido(String apellido2) {
		// TODO Auto-generated method stub
		
	}

	public void setEdad(int edad2) {
		// TODO Auto-generated method stub
		
	}

	public void setDireccion(Direccion newDireccion) {
		// TODO Auto-generated method stub
		
	}

}
