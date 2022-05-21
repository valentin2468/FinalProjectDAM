package com.iesjaumeeljust.database.service;

import java.util.List;

import com.iesjaumeeljust.database.model.Alumno;

public interface AlumnoService {
	public List<Alumno> findAll();
	public Alumno findAlumnoById(Integer id);
	public List<Alumno> findAllByCurso(Integer id);
	
}
