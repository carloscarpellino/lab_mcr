package com.gruppomcr.anagrafica.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gruppomcr.anagrafica.dto.AnagraficaDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface AnagraficaRepository extends JpaRepository<AnagraficaDTO, Integer> {
	@Query("SELECT anagrafica FROM AnagraficaDTO anagrafica")
	List<AnagraficaDTO> allAnagrafica();
}
