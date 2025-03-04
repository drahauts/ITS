package com.spring.prodotto.dto;

public class ProdottoNoIdDTO {
		private int quantita;
		private String marca, modello, descrizione, categoria;
		private double prezzoConsigliato, prezzoMassimo;
		
		public ProdottoNoIdDTO() {
		}
		
		public ProdottoNoIdDTO(int quantita, String marca, String modello, String descrizione, String categoria,
				double prezzoConsigliato, double prezzoMassimo) {
			this.quantita = quantita;
			this.marca = marca;
			this.modello = modello;
			this.descrizione = descrizione;
			this.categoria = categoria;
			this.prezzoConsigliato = prezzoConsigliato;
			this.prezzoMassimo = prezzoMassimo;
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