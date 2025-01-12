package com.gruppomcr.anagrafica.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gruppomcr.anagrafica.dto.AnagraficaDTO;
import com.gruppomcr.anagrafica.repository.AnagraficaRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AnagraficaService {
	private AnagraficaRepository anagraficaRepository;
	
	@Autowired
	public AnagraficaService(AnagraficaRepository anagraficaRepository){
        this.anagraficaRepository = anagraficaRepository;
    }
	
	public List<AnagraficaDTO> allAnagrafica() {
		List<AnagraficaDTO> result = new ArrayList<>();
		result = anagraficaRepository.findAll();
		return result;
	}
	
	public AnagraficaDTO getAnagraficaById(Integer idAnagrafica) {
		Optional<AnagraficaDTO> anagrafica = anagraficaRepository.findById(idAnagrafica);
		return anagrafica.isEmpty() ? null: anagrafica.get();
	}
	@Transactional
	public void saveAnagrafica(AnagraficaDTO anagrafica) {
		anagraficaRepository.save(anagrafica);
	}
	
	public void deleteAnagrafica(Integer idAnagrafica) {
		anagraficaRepository.deleteById(idAnagrafica);
	}

	public boolean existsByIdAnagrafica(Integer idAnagrafica) {
		boolean result = anagraficaRepository.existsById(idAnagrafica);
		return result;
	}
}
