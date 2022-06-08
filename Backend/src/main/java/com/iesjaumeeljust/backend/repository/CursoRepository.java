package com.iesjaumeeljust.backend.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.iesjaumeeljust.backend.model.Curso;

import java.util.List;

public interface CursoRepository extends CrudRepository<Curso, Integer> {
    @Query("select c from Curso c where c.modulo.id = ?1")
    List<Curso> getCursosByModulo(Integer idModulo);
}
