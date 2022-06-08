package com.iesjaumeeljust.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iesjaumeeljust.backend.model.Asignatura;
import com.iesjaumeeljust.backend.service.AsignaturaService;

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
