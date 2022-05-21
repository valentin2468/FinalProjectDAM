package com.iesjaumeeljust.database.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

import com.iesjaumeeljust.database.model.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {
    @Query("select a from Alumno a where a.curso.id = ?1")
    List<Alumno> findAllByCurso(Integer id);
}
