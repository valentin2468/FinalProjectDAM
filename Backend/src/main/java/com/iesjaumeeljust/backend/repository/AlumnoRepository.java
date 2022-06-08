package com.iesjaumeeljust.backend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.iesjaumeeljust.backend.model.Alumno;

import java.util.List;

public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {
    @Query("select a from Alumno a where a.curso.id = ?1")
    List<Alumno> findAllByCurso(Integer id);
}
