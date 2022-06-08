package com.iesjaumeeljust.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iesjaumeeljust.backend.model.Examen;
import com.iesjaumeeljust.backend.service.ExamenService;

@RestController
@RequestMapping("/api")
public class ExamenController {

    @Autowired
    ExamenService examenService;

    @GetMapping("examenes/asignatura")
    public List<Examen> getExamenesByAsignatura(@RequestParam("idAsignatura") Integer id){
        return examenService.findAllByAsignatura(id);
    }
}
