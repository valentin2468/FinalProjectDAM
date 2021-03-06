package com.iesjaumeeljust.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iesjaumeeljust.backend.model.Modulo;
import com.iesjaumeeljust.backend.repository.ModuloRepository;

@Service
public class ModuloServiceImpl implements ModuloService {
	
	@Autowired
	ModuloRepository moduloRepository;

	@Override
	public List<Modulo> findAll() {
		return (List<Modulo>) moduloRepository.findAll();
	}

	@Override
	public Modulo findModuloById(Integer id) {
		return moduloRepository.findById(id).get();
	}

}
