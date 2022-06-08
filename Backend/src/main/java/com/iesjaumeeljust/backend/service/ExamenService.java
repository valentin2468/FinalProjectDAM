package com.iesjaumeeljust.backend.service;

import java.util.List;

import com.iesjaumeeljust.backend.model.Examen;

public interface ExamenService {
	public List<Examen> findAll();
	public Examen findExamenById(Integer id);
	public List<Examen> findAllByAsignatura(Integer id);
}
