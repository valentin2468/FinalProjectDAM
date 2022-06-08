package com.iesjaumeeljust.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.iesjaumeeljust.backend.model.ProfesorAsignatura;
import com.iesjaumeeljust.backend.model.ProfesorAsignaturaPK;

public interface ProfesorAsignaturaRepository extends CrudRepository<ProfesorAsignatura, ProfesorAsignaturaPK> {
    
}
