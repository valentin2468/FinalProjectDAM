package com.iesjaumeeljust.database.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

import com.iesjaumeeljust.database.model.Curso;

public interface CursoRepository extends CrudRepository<Curso, Integer> {
    @Query("select c from Curso c where c.modulo.id = ?1")
    List<Curso> getCursosByModulo(Integer idModulo);
}
