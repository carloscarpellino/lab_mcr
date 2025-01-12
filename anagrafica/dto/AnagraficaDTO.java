package com.gruppomcr.anagrafica.dto;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "anagrafica")
@Setter
@Getter
public class AnagraficaDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	@Column(name = "nome", nullable = false)
	private String nome;
	@Column(name = "cognome", nullable = false)
	private String cognome;
	@Column(name = "codice_fiscale")
	private String codiceFiscale;
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "matricola", referencedColumnName = "id")
	private DatiAziendaliDTO datiAziendali;
	@Column(name = "nazionalita")
	private String nazionalita;
	@Column(name = "telefono")
	private String telefono;
	@Column(name = "email")
	private String email;
	@Column(name = "indirizzo_citta")
	private String indirizzoCitta;
	@Column(name = "indirizzo_provincia")
	private String indirizzoProvincia;
	@Column(name = "indirizzo_via")
	private String indirizzoVia;
	@Column(name = "indirizzo_civico")
	private Integer indirizzoNumero;
	@Column(name = "indirizzo_cap")
	private Integer indirizzoCap;
	@Column(name = "data_nascita")
	private LocalDate dataNascita;
}
