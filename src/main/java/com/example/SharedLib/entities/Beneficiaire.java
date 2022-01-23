package com.example.SharedLib.entities;


import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Beneficiaire")
@Data @NoArgsConstructor 
public class Beneficiaire extends Client {
	private int nbr_transfert_recus;
	@JsonIgnoreProperties({"beneficiaire"})
	@OneToOne(mappedBy = "beneficiaire")
	private Transfert transfert;

}
