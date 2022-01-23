package com.example.SharedLib.entities;


import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Emetteur")
@Data @NoArgsConstructor @AllArgsConstructor
public class Emetteur extends Client {
	private double limite_somme_transfert;
	private int nbr_transfert_envoyes;
	@JsonIgnoreProperties({"emetteur"})
	@OneToOne(mappedBy = "emetteur")
	private Transfert transfert;
}
