package com.iesjaumeeljust.database.controller;

import java.util.List;

import com.iesjaumeeljust.database.model.Asignatura;
import com.iesjaumeeljust.database.service.AsignaturaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AsignaturaController {
    
    @Autowired
    AsignaturaService asignaturaService;

    @GetMapping("asignaturas/curso")
    public List<Asignatura> findAllByCurso(@RequestParam("idCurso") Integer id){
        return asignaturaService.findAllByCurso(id);
    }
}
