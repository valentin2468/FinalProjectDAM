package com.iesjaumeeljust.database.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class ProfesorAsignaturaPK implements Serializable {

	private static final long serialVersionUID = -7073467377734704051L;
	
	@Column(name = "id_curso")
	private Integer idCurso;
	@Column(name = "id_asignatura")
	private Integer idAsignatura;
	
}
