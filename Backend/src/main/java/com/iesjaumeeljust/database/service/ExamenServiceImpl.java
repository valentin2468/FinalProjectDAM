package com.iesjaumeeljust.database.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iesjaumeeljust.database.model.Examen;
import com.iesjaumeeljust.database.repository.ExamenRepository;

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

}
