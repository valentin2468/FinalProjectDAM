package com.iesjaumeeljust.backend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.iesjaumeeljust.backend.model.Asignatura;

import java.util.List;

public interface AsignaturaRepository extends CrudRepository<Asignatura, Integer> {
    @Query("select a from Asignatura a where a.curso.id = ?1")
    List<Asignatura> findAllByCurso(Integer id);
}
