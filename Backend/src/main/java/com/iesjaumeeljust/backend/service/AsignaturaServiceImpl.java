package com.iesjaumeeljust.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iesjaumeeljust.backend.model.Asignatura;
import com.iesjaumeeljust.backend.repository.AsignaturaRepository;

@Service
public class AsignaturaServiceImpl implements AsignaturaService {
	
	@Autowired
	AsignaturaRepository asignaturaRepository;

	@Override
	public List<Asignatura> findAll() {
		return (List<Asignatura>) asignaturaRepository.findAll();
	}

	@Override
	public Asignatura findAsignaturaById(Integer id) {
		return asignaturaRepository.findById(id).get();
	}

	@Override
	public List<Asignatura> findAllByCurso(Integer id) {
		return asignaturaRepository.findAllByCurso(id);
	}

}
