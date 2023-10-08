package com.relations.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Categorie extends Audit {

	@Column(unique = true,nullable = false)
	private String titre;
}
