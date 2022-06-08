package com.iesjaumeeljust.backend.service;

import java.util.List;

import com.iesjaumeeljust.backend.model.Modulo;

public interface ModuloService {
	public List<Modulo> findAll();
	public Modulo findModuloById(Integer id);
}
