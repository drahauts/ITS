package com.spring.utente.service;

import java.util.List;

import com.spring.utente.dto.NomeCognomeDTO;
import com.spring.utente.dto.NomeCognomeQuantitaDTO;
import com.spring.utente.dto.UtenteDTO;

public interface UtenteService {
	public boolean registra(UtenteDTO dto);
	public UtenteDTO cercaPerId(int id);
	public boolean eliminaPerId(int id);
	public List<UtenteDTO> mostraTutti();
	public NomeCognomeDTO getNomeCognome(int id);
	public NomeCognomeQuantitaDTO mostraTuttiNomeCognome();
}
