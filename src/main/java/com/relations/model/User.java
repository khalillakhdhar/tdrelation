package com.relations.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Entity
@Data
public class User extends Audit {

	@Column(nullable = false)
	private String nom,telephone,adresse,mdp;
@Email
@Column(unique = true,nullable = false)
private String email;
}
