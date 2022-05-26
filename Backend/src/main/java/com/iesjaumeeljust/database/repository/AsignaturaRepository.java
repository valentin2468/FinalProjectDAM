package com.iesjaumeeljust.database.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

import com.iesjaumeeljust.database.model.Asignatura;

public interface AsignaturaRepository extends CrudRepository<Asignatura, Integer> {
    @Query("select a from Asignatura a where a.curso.id = ?1")
    List<Asignatura> findAllByCurso(Integer id);
}
