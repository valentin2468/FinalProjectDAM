package com.iesjaumeeljust.backend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.iesjaumeeljust.backend.model.Curso;
import com.iesjaumeeljust.backend.model.Modulo;
import com.iesjaumeeljust.backend.model.Profesor;

import java.util.HashSet;
import java.util.List;

public interface ProfesorRepository extends CrudRepository<Profesor, Integer> {
    @Query("select c.modulo from Curso c where c.id in (select pa.curso from ProfesorAsignatura pa where pa.profesor.id = ?1)")
    List<Modulo> findModulosByProfesor(Integer idProfesor);
}
