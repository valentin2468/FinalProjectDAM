package com.iesjaumeeljust.backend.service;

import java.util.List;

import com.iesjaumeeljust.backend.model.Asignatura;

public interface AsignaturaService {
	public List<Asignatura> findAll();
	public Asignatura findAsignaturaById(Integer id);
	public List<Asignatura> findAllByCurso(Integer id);
}
