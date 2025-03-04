package com.spring.prodotto.entity;

public class Prodotto {
	private int id, quantita;
	private String marca, modello, descrizione, categoria;
	private double prezzoConsigliato, prezzoMassimo;
	
	public Prodotto() {
	}

	public Prodotto(int id, int quantita, String marca, String modello, String descrizione, String categoria,
			double prezzoConsigliato, double prezzoMassimo) {
		this.id = id;
		this.quantita = quantita;
		this.marca = marca;
		this.modello = modello;
		this.descrizione = descrizione;
		this.categoria = categoria;
		this.prezzoConsigliato = prezzoConsigliato;
		this.prezzoMassimo = prezzoMassimo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrezzoConsigliato() {
		return prezzoConsigliato;
	}

	public void setPrezzoConsigliato(double prezzoConsigliato) {
		this.prezzoConsigliato = prezzoConsigliato;
	}

	public double getPrezzoMassimo() {
		return prezzoMassimo;
	}

	public void setPrezzoMassimo(double prezzoMassimo) {
		this.prezzoMassimo = prezzoMassimo;
	}
	
	
}
