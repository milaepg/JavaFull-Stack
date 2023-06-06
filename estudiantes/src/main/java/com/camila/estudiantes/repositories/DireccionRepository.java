package com.camila.estudiantes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.camila.estudiantes.models.Direccion;

public interface DireccionRepository extends JpaRepository<Direccion, Long> {

}
