package com.spring.utente.dto;

import java.util.List;

public class NomeCognomeQuantitaDTO {
	private static int count = 0;
	private List<NomeCognomeDTO> lista;
	
	public NomeCognomeQuantitaDTO() {
		// TODO Auto-generated constructor stub
	}

	public NomeCognomeQuantitaDTO(List<NomeCognomeDTO> lista) {
		count++;
		this.lista = lista;
	}

	public List<NomeCognomeDTO> getLista() {
		return lista;
	}

	public void setLista(List<NomeCognomeDTO> lista) {
		this.lista = lista;
	}

	public static int getCount() {
		return count;
	}
	
	

}
