package com.relations.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Min;
import lombok.Data;
@Entity
@Data
public class Commande extends Audit {
private String produit,etat;
@Temporal(TemporalType.TIMESTAMP)
private Date date;
@Min(value = 1)
private int quantite;
@ManyToOne(fetch = FetchType.LAZY,optional = false)
@JoinColumn(name = "userid")

private User user;



}
