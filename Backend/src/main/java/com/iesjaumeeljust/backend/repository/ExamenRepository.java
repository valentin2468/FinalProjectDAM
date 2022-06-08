package com.iesjaumeeljust.backend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.iesjaumeeljust.backend.model.Examen;

import java.util.List;

public interface ExamenRepository extends CrudRepository<Examen, Integer> {
    @Query("select e from Examen e where e.asignatura.id = ?1")
    List<Examen> findExamenesByAsignatura(Integer idAsignatura);
}
