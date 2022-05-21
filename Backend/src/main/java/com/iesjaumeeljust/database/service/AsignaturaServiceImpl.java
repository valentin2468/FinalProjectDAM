package com.iesjaumeeljust.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iesjaumeeljust.database.model.Asignatura;
import com.iesjaumeeljust.database.repository.AsignaturaRepository;

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

}
