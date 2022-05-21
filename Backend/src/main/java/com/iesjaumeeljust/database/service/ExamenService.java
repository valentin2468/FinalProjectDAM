package com.iesjaumeeljust.database.service;

import java.util.List;

import com.iesjaumeeljust.database.model.Examen;

public interface ExamenService {
	public List<Examen> findAll();
	public Examen findExamenById(Integer id);
}
