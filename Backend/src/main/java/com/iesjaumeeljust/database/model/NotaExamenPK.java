package com.iesjaumeeljust.database.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotaExamenPK implements Serializable{
	private static final long serialVersionUID = -1963351309820398400L;
	
	@Column(name = "id_examen")
	private Integer idExamen;
	@Column(name = "id_alumno")
	private Integer idAlumno;
}
