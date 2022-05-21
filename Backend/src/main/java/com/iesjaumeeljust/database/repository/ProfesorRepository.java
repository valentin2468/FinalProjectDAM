package com.iesjaumeeljust.database.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.HashSet;
import java.util.List;

import com.iesjaumeeljust.database.model.Curso;
import com.iesjaumeeljust.database.model.Modulo;
import com.iesjaumeeljust.database.model.Profesor;

public interface ProfesorRepository extends CrudRepository<Profesor, Integer> {
    @Query("select c.modulo from Curso c where c.id in (select pa.curso from ProfesorAsignatura pa where pa.profesor.id = ?1)")
    List<Modulo> findModulosByProfesor(Integer idProfesor);
}
