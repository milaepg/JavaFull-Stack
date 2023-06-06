package com.camila.estudiantes.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity 
public class Direccion {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String direccion;
    private String ciudad;
    private String estado;

    @OneToOne
    @JoinColumn(name = "estudiante_id")
    private Estudiante estudiante;

	public void setDireccion(String direccion2) {
		// TODO Auto-generated method stub
		
	}

	public void setCiudad(String ciudad2) {
		// TODO Auto-generated method stub
		
	}

	public void setEstado(String estado2) {
		// TODO Auto-generated method stub
		
	}

	public void setEstudiante(Estudiante estudiante2) {
		// TODO Auto-generated method stub
		
	}

}