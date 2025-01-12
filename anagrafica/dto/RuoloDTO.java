package com.gruppomcr.anagrafica.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ruolo")
@Getter @Setter
public class RuoloDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "nome", nullable = false)
	private String nome;
	@Column(name = "descrizione")
	private String descrizione;
	@Column(name = "data_modifica", nullable = false)
	private LocalDate dataModifica;
	@Column(name = "codice", nullable = false)
	private String codice;
}
