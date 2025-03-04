package com.spring.utente.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.utente.dao.DAOUtente;
import com.spring.utente.dto.NomeCognomeDTO;
import com.spring.utente.dto.NomeCognomeQuantitaDTO;
import com.spring.utente.dto.UtenteDTO;
import com.spring.utente.entity.Utente;
import com.spring.utente.utility.Conversioni;

@Service
public class UtenteServiceImpl implements UtenteService{
	
	@Autowired	
	private DAOUtente dao;
	
	public boolean registra(UtenteDTO dto){
		//	1. trasformo id dto in entity
		Utente entity = Conversioni.daUtenteDTOaUtente(dto);
		 
		//	2. inserisco l'entity attraverso il dao
		return dao.insert(entity);
	}
	
	public UtenteDTO cercaPerId(int id) {
		//1. Chiamo il DAO
		Utente utente = dao.selectById(id);
		
		if(utente != null) {
			//2. Trasformo
			UtenteDTO dto = Conversioni.daUtenteAUtenteDTO(utente);
			return dto;
		}
		return null;
	}
	
	public boolean eliminaPerId(int id) {
		return dao.delete(id);
	}
	
	public List<UtenteDTO> mostraTutti() {
		List<Utente> utenti = dao.selectAll();
		
		List<UtenteDTO> utentiDTO = new ArrayList<>();
		
		for(Utente utente : utenti) {
			utentiDTO.add(Conversioni.daUtenteAUtenteDTO(utente));
		}
		
		return utentiDTO;
	}
	
	
	public NomeCognomeDTO getNomeCognome(int id) {
		Utente utente = dao.selectById(id);
		if(utente != null) {
			return new NomeCognomeDTO(utente.getNome(), utente.getCognome());
		}
		return null;
		
	}
	
	public NomeCognomeQuantitaDTO mostraTuttiNomeCognome() {
		List<Utente> utenti = dao.selectAll();
		List<NomeCognomeDTO> utentiDTO = new ArrayList<>();
		
		for(Utente utente : utenti) {
			utentiDTO.add(new NomeCognomeDTO(utente.getNome(), utente.getCognome()));
		}
		return new NomeCognomeQuantitaDTO(utentiDTO);
	}

}
