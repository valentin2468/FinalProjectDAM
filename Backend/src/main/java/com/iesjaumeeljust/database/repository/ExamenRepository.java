package com.iesjaumeeljust.database.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

import com.iesjaumeeljust.database.model.Examen;

public interface ExamenRepository extends CrudRepository<Examen, Integer> {
    @Query("select e from Examen e where e.asignatura.id = ?1")
    List<Examen> findExamenesByAsignatura(Integer idAsignatura);
}
