package com.camila.estudiantes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.camila.estudiantes.models.Direccion;
import com.camila.estudiantes.models.Estudiante;
import com.camila.estudiantes.repositories.DireccionRepository;
import com.camila.estudiantes.repositories.EstudianteRepository;

@Service
public class ApiService {
	private final EstudianteRepository estudianteRepository;
    private final DireccionRepository direccionRepository;

    @Autowired
    public ApiService(EstudianteRepository estudianteRepository, DireccionRepository direccionRepository) {
        this.estudianteRepository = estudianteRepository;
        this.direccionRepository = direccionRepository;
    }

    public Estudiante createEstudiante(String nombre, String apellido, int edad) {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre(nombre);
        estudiante.setApellido(apellido);
        estudiante.setEdad(edad);
        return estudianteRepository.save(estudiante);
    }

    public Direccion createDireccion(Long estudianteId, String direccion, String ciudad, String estado) {
        Estudiante estudiante = estudianteRepository.findById(estudianteId).orElseThrow(() -> new RuntimeException("Estudiante no encontrado"));

        Direccion newDireccion = new Direccion();
        newDireccion.setDireccion(direccion);
        newDireccion.setCiudad(ciudad);
        newDireccion.setEstado(estado);
        newDireccion.setEstudiante(estudiante);

        estudiante.setDireccion(newDireccion);

        return direccionRepository.save(newDireccion);
    }

    public List<Estudiante> getAllStudents() {
        return estudianteRepository.findAll();
    }

}
