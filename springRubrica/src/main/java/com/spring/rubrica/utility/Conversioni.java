package com.spring.rubrica.utility;

import java.util.ArrayList;
import java.util.List;

import com.spring.rubrica.dto.ContattoDTO;
import com.spring.rubrica.dto.RubricaDTO;
import com.spring.rubrica.entity.Contatto;
import com.spring.rubrica.entity.Rubrica;

public class Conversioni {
	public static Rubrica daRubricaDTOaRubrica(RubricaDTO dto) {
		return new Rubrica(dto.getId(), dto.getAnnoCreazione(), dto.getProprietario());
	}
	
	public static RubricaDTO daRubricaARubricaDTO(Rubrica entity) {
		return new RubricaDTO(entity.getId(), entity.getAnnoCreazione(), entity.getProprietario());
	}
	
	public static RubricaDTO daRubricaARubricaDTOAnnoEProprietario(Rubrica entity) {
		return new RubricaDTO(entity.getAnnoCreazione(), entity.getProprietario());
	}
	
	public static Contatto daContattiDTOaContatti(ContattoDTO dto) {
		return new Contatto(dto.getNome(), dto.getCognome(), dto.getNumero(), dto.getGruppoAppartenenza(), dto.getDataNascita(), dto.isPreferito());
	}
	
	public static ContattoDTO daContattoAContattoDTO(Contatto entity) {
		return new ContattoDTO(entity.getNome(), entity.getCognome(), entity.getNumero(), entity.getGruppoAppartenenza(), entity.getDataNascita(), entity.isPreferito());
	}

	
	// Da finire!!!
	public static RubricaDTO daRubricaARubricaDTOProprietarioENumContatti(Rubrica entity) {
		List<ContattoDTO> listDTO = new ArrayList<>();
		for (Contatto c: entity.getContatti()) {
			listDTO.add(Conversioni.daContattoAContattoDTO(c));
		}
		return new RubricaDTO(entity.getProprietario(), listDTO);
	}

}
