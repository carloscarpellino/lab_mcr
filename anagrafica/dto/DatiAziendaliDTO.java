package com.gruppomcr.anagrafica.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "dati_aziendali")
@Setter
@Getter
public class DatiAziendaliDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "email")
	private String emailAziendale;
	@Column(name = "stipendio")
	private Float stipendio;
	@Column(name = "tariffa")
	private Float tariffa;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ruolo")
	private RuoloDTO ruolo;
	@Column(name = "sede")
	private String sede;
	@Column(name = "data_creazione")
	private LocalDateTime dataCreazione;
	@Column(name = "data_modifica")
	private LocalDateTime dataModifica;
	@Column(name = "data_fine_rapporto")
	private LocalDate dataLicenziamento;
	@Column(name = "matricola")
	private int matricola;
}
