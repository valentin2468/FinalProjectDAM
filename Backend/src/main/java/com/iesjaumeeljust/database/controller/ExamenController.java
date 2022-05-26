package com.iesjaumeeljust.database.controller;

import java.util.List;

import com.iesjaumeeljust.database.model.Examen;
import com.iesjaumeeljust.database.service.ExamenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
