package com.iesjaumeeljust.backend.service;

import java.util.List;

import com.iesjaumeeljust.backend.model.Curso;

public interface CursoService {
	public List<Curso> findAll();
	public Curso findCursoById(Integer id);
	public List<Curso> getCursosByModulo(Integer idModulo);
}
