package com.relations.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class Produit extends Audit{
private String titre,description,photo;
private double prix;
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "categorie",referencedColumnName = "titre")
private Categorie categorie;
}
