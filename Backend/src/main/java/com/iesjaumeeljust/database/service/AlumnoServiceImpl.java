package com.iesjaumeeljust.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iesjaumeeljust.database.model.Alumno;
import com.iesjaumeeljust.database.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	AlumnoRepository alumnoRepository;

	@Override
	public List<Alumno> findAll() {
		return (List<Alumno>) alumnoRepository.findAll();
	}

	@Override
	public Alumno findAlumnoById(Integer id) {
		return alumnoRepository.findById(id).get();
	}

	@Override
	public List<Alumno> findAllByCurso(Integer id) {
		return alumnoRepository.findAllByCurso(id);
	}

}
