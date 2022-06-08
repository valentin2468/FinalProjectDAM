package com.iesjaumeeljust.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iesjaumeeljust.backend.model.Modulo;
import com.iesjaumeeljust.backend.model.Profesor;
import com.iesjaumeeljust.backend.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService {
	
	@Autowired
	ProfesorRepository profesorRepository;

	@Override
	public List<Profesor> findAll() {
		return (List<Profesor>) profesorRepository.findAll();
	}

	@Override
	public Profesor findProfesorById(Integer id) {
		return profesorRepository.findById(id).get();
	}

	@Override
	public List<Modulo> findModulosByProfesor(Integer idProfesor) {
		return profesorRepository.findModulosByProfesor(idProfesor);
	}

	@Override
	public Profesor saveProfesor(Profesor profesor) {
		return profesorRepository.save(profesor);
	}

}
