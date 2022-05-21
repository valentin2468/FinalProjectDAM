package com.iesjaumeeljust.database.service;

import java.util.List;

import com.iesjaumeeljust.database.model.Asignatura;

public interface AsignaturaService {
	public List<Asignatura> findAll();
	public Asignatura findAsignaturaById(Integer id);
}
