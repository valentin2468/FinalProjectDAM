package com.iesjaumeeljust.database.service;
import java.util.List;

import com.iesjaumeeljust.database.model.Modulo;
import com.iesjaumeeljust.database.model.Profesor;

public interface ProfesorService {
	public List<Profesor> findAll();
	public Profesor findProfesorById(Integer id);
	public List<Modulo> findModulosByProfesor(Integer idProfesor);
}
