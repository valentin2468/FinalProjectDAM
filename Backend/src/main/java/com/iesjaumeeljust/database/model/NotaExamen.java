package com.iesjaumeeljust.database.model;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NotaExamen {
	@EmbeddedId
	private NotaExamenPK id;
	
	@ManyToOne
	@MapsId("idExamen")
	@JoinColumn(name = "id_examen")
	private Examen examen;
	@ManyToOne
	@MapsId("idAlumno")
	@JoinColumn(name = "id_alumno")
	private Alumno alumno;
	
	private Float nota;
}
