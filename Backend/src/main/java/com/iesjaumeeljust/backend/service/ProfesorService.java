package com.iesjaumeeljust.backend.service;
import java.util.List;

import com.iesjaumeeljust.backend.model.Modulo;
import com.iesjaumeeljust.backend.model.Profesor;

public interface ProfesorService {
	public List<Profesor> findAll();
	public Profesor findProfesorById(Integer id);
	public List<Modulo> findModulosByProfesor(Integer idProfesor);
	public Profesor saveProfesor(Profesor profesor);
}
