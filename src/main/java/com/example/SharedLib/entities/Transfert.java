package com.example.SharedLib.entities;

import java.util.Date;

import javax.persistence.*;

import com.example.SharedLib.enums.EtatTransfert;
import com.example.SharedLib.enums.MotifTransfert;
import com.example.SharedLib.enums.TypeFrais;
import com.example.SharedLib.enums.TypeTransfert;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="Transfert")
@Data @NoArgsConstructor @AllArgsConstructor
public class Transfert {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@JsonProperty(access=Access.READ_ONLY)
	private long id;
	private String reference;
	private String codePin;
	@Enumerated(EnumType.STRING)
	private TypeTransfert type;
	@Enumerated(EnumType.STRING)
	private EtatTransfert etat;
	private Date delai_de_validite;
	private Date delai_de_desherence;
	private Date date_demission;
	private Date date_de_blocage;
	private Date date_de_deblocage;
	private double montant_transfert;
	private double montant_operation;
	private double comission;
	private TypeFrais frais;
	@ManyToOne
	@JoinColumn(name="emetteur_id")
	@JsonIgnoreProperties({"transfert"})
	private Emetteur emetteur;
	@ManyToOne
	@JoinColumn(name="agent_id")
	@JsonIgnoreProperties({"transfert","pointdevente"})
	private Agent agent;
	private String pays_d_emission;
	@ManyToOne
	@JoinColumn(name="beneficiaire_id")
	@JsonIgnoreProperties({"transfert"})
	private Beneficiaire beneficiaire;
	@Enumerated(EnumType.STRING)
	private MotifTransfert motif;
	@ManyToOne
	@JoinColumn(name="transfert_multiple_id")
	@JsonIgnoreProperties({"transferts"})
	private TransfertMultiple transfertMultiple;
	@ManyToOne
	@JoinColumn(name="lieuDeService")
	@JsonIgnoreProperties({"transfert_demandes","transfert_servis","agents"})
	private LieuDeTravail lieuDeService;
	@ManyToOne
	@JoinColumn(name="lieuDeDemande")
	@JsonIgnoreProperties({"transfert_demandes","transfert_servis","agents"})
	private LieuDeTravail lieuDeDemande;
	private boolean notification=false;
	private String motifRestitution;
	private String motifblocage;
}
