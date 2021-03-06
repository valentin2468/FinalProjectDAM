package com.iesjaumeeljust.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iesjaumeeljust.backend.model.Examen;
import com.iesjaumeeljust.backend.repository.ExamenRepository;

@Service
public class ExamenServiceImpl implements ExamenService{
	
	@Autowired
	ExamenRepository examenRepository;

	@Override
	public List<Examen> findAll() {
		return (List<Examen>) examenRepository.findAll();
	}

	@Override
	public Examen findExamenById(Integer id) {
		return examenRepository.findById(id).get();
	}

	@Override
	public List<Examen> findAllByAsignatura(Integer id) {
		return examenRepository.findExamenesByAsignatura(id);
	}

}
