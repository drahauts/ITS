package com.spring.rubrica.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.rubrica.dao.DAORubrica;
import com.spring.rubrica.dto.RubricaDTO;
import com.spring.rubrica.entity.Rubrica;
import com.spring.rubrica.utility.Conversioni;

public class RubricaService {

	@Autowired
	private DAORubrica dao;

	// Inserisci nuova rubrica (vuota)
	public boolean inserisci(RubricaDTO dto) {
		Rubrica rubrica = Conversioni.daRubricaDTOaRubrica(dto);
		return dao.insert(rubrica);
	}

	// Visualizza una rubrica per id
	public RubricaDTO visualizzaPerId(int id) {
		Rubrica rubrica = dao.selectById(id);
//		if(rubrica != null) {
//			RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
//			return dto;
//		}
//		return null;
		return (rubrica != null) ? Conversioni.daRubricaARubricaDTO(rubrica) : null;
	}

	// Visualizza tutte le rubriche
	public List<RubricaDTO> visualizzaTutti() {
		List<Rubrica> rubriche = dao.selectAll();
		List<RubricaDTO> dto = new ArrayList<>();

		for (Rubrica rubrica : rubriche) {
			dto.add(Conversioni.daRubricaARubricaDTO(rubrica));
		}
		return dto;
	}

	// Cancella una rubrica esistente
	public boolean deleteRubrica(int id) {
		return dao.delete(id);
	}

	// Visualizza solo proprietario e anno creazione di una rubrica (passando l’ id)
	public RubricaDTO visualizzaProprietarioEAnno(int id) {
		Rubrica rubrica = dao.selectById(id);
		if (rubrica != null) {
			RubricaDTO dto = Conversioni.daRubricaARubricaDTOAnnoEProprietario(rubrica);
			return dto;
		}
		return null;
	}

	// Modifica il nome proprietario di una rubrica esistente (torna la rubrica
	// aggiornata)
	public RubricaDTO modificaNomeProprietario(int id, String nuovoNome) {
		Rubrica rubrica = dao.selectById(id);
		if (rubrica != null) {
			rubrica.setProprietario(nuovoNome);
			if (dao.update(rubrica)) {
				RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
				return dto;
			}
		}
		return null;
	}

	// Modifica anno di creazione di una rubrica esistente (torna la rubrica
	// aggiornata)
	public RubricaDTO modificaAnnoCreazione(int id, int annoNuovo) {
		Rubrica rubrica = dao.selectById(id);
		if (rubrica != null) {
			rubrica.setAnnoCreazione(annoNuovo);
			if (dao.update(rubrica)) {
				RubricaDTO dto = Conversioni.daRubricaARubricaDTO(rubrica);
				return dto;
			}
		}
		return null;
	}

	// Visualizza i nomi di tutti i proprietari delle rubriche e il loro numero totale 
	public List<RubricaDTO> visualizzaProprietarioENumTotCont() {
		List<Rubrica> rubriche = dao.selectAll();
		List<RubricaDTO> dto = new ArrayList<>();
		
		if(rubriche != null && !rubriche.isEmpty()) {
			for(Rubrica rubrica : rubriche) {
				dto.add(Conversioni.daRubricaARubricaDTOProprietarioENumContatti(rubrica));
			}
			return dto;
		}
		return null;
	}
	

	
}
