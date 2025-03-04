package com.spring.university.dto;

public class StudenteDTO {
	private int matricola;
	private String nome, cognome, indirizzo;
	private int annoNascita, annoMatricolazione;
	
	public StudenteDTO() {
		// TODO Auto-generated constructor stub
	}

	public StudenteDTO(int matricola, String nome, String cognome, String indirizzo, int annoNascita,
			int annoMatricolazione) {
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.annoNascita = annoNascita;
		this.annoMatricolazione = annoMatricolazione;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public int getAnnoNascita() {
		return annoNascita;
	}

	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}

	public int getAnnoMatricolazione() {
		return annoMatricolazione;
	}

	public void setAnnoMatricolazione(int annoMatricolazione) {
		this.annoMatricolazione = annoMatricolazione;
	}
	
	
}
