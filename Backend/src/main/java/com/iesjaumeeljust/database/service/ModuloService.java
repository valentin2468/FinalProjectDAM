package com.iesjaumeeljust.database.service;

import java.util.List;

import com.iesjaumeeljust.database.model.Modulo;

public interface ModuloService {
	public List<Modulo> findAll();
	public Modulo findModuloById(Integer id);
}
