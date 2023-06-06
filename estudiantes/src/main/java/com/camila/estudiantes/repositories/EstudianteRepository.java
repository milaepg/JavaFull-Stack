package com.camila.estudiantes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camila.estudiantes.models.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

}
