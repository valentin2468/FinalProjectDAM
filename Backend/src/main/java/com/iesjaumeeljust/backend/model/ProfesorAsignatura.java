package com.iesjaumeeljust.backend.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import com.fasterxml.jackson.core.sym.Name;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProfesorAsignatura {
	@EmbeddedId
	private ProfesorAsignaturaPK id;
	
	@ManyToOne
	@MapsId("idCurso")
	@JoinColumn(name = "id_curso")
	private Curso curso;
	
	@ManyToOne
	@MapsId("idAsignatura")
	@JoinColumn(name = "id_asignatura")
	private Asignatura asignatura;
	
	
	@ManyToOne
	@JoinColumn(name = "id_profesor")
	private Profesor profesor;
}
