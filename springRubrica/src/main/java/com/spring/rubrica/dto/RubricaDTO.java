package com.spring.rubrica.dto;

import java.util.ArrayList;
import java.util.List;

public class RubricaDTO {
	private int id, annoCreazione;
	private String proprietario;
	private List<ContattoDTO> contatti;
	
	public RubricaDTO() {}

	
	//Costruttore senza contatti(per rubrica vuota)
	public RubricaDTO(int id, int annoCreazione, String proprietario) {
		super();
		this.id = id;
		this.annoCreazione = annoCreazione;
		this.proprietario = proprietario;
	}


	public RubricaDTO(int id, int annoCreazione, String proprietario, List<ContattoDTO> contatti) {
		this.id = id;
		this.annoCreazione = annoCreazione;
		this.proprietario = proprietario;
		this.contatti = contatti;
	}
	
	//proprietario e anno creazione
	public RubricaDTO(int annoCreazione, String proprietario) {
		this.annoCreazione = annoCreazione;
		this.proprietario = proprietario;
	}
	
	//proprietario e contatti
	public RubricaDTO(String proprietario, List<ContattoDTO> contatti) {
		this.proprietario = proprietario;
		this.contatti = new ArrayList<>();
	}


	public int getId() {return id;}

	public void setId(int id) {this.id = id;}

	public int getAnnoCreazione() {return annoCreazione;}

	public void setAnnoCreazione(int annoCreazione) {this.annoCreazione = annoCreazione;}

	public String getProprietario() {return proprietario;}

	public void setProprietario(String proprietario) {this.proprietario = proprietario;}

	public List<ContattoDTO> getContatti() {return contatti;}

	public void setContatti(List<ContattoDTO> contatti) {this.contatti = contatti;}
}
