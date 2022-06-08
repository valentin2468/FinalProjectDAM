package com.iesjaumeeljust.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iesjaumeeljust.backend.model.Curso;
import com.iesjaumeeljust.backend.repository.CursoRepository;

@Service
public class CursoServiceImpl implements CursoService {
	
	@Autowired
	CursoRepository cursoRepository;

	@Override
	public List<Curso> findAll() {
		return (List<Curso>) cursoRepository.findAll();
	}

	@Override
	public Curso findCursoById(Integer id) {
		return cursoRepository.findById(id).get();
	}

	@Override
	public List<Curso> getCursosByModulo(Integer idModulo) {
		return cursoRepository.getCursosByModulo(idModulo);
	}

}
