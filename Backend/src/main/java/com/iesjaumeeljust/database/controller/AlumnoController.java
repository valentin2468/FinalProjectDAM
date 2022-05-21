package com.iesjaumeeljust.database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.iesjaumeeljust.database.model.Alumno;
import com.iesjaumeeljust.database.service.AlumnoService;

@RestController
@RequestMapping("/api")
public class AlumnoController {
	
	@Autowired
	AlumnoService alumnoService;
	
	@GetMapping("/alumnos")
	public List<Alumno> getAlumnos(){
		return alumnoService.findAll();
	}

	@GetMapping("/alumnos/curso")
	@ResponseBody
	public List<Alumno> findAllByCurso(@RequestParam("idCurso") Integer id){
		return alumnoService.findAllByCurso(id);
	}
}
