package com.iesjaumeeljust.database.service;

import java.util.List;

import com.iesjaumeeljust.database.model.Modulo;
import com.iesjaumeeljust.database.model.Profesor;
import com.iesjaumeeljust.database.repository.ProfesorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
