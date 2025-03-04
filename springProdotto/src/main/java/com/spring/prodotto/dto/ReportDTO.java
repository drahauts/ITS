package com.spring.prodotto.dto;

import java.util.List;

public class ReportDTO {
	private List<String> descrizioni, nomeProdottiNonDisponibili ;
	private int pezziTotali;
	private int prodottiNonDisponibili;
	private double mediaPrezzi;
	
	public ReportDTO() {
	}

	public ReportDTO(List<String> descrizioni, List<String> nomeProdottiNonDisponibili, int pezziTotali,
			int prodottiNonDisponibili, double mediaPrezzi) {
		this.descrizioni = descrizioni;
		this.nomeProdottiNonDisponibili = nomeProdottiNonDisponibili;
		this.pezziTotali = pezziTotali;
		this.prodottiNonDisponibili = prodottiNonDisponibili;
		this.mediaPrezzi = mediaPrezzi;
	}

	public List<String> getDescrizioni() {
		return descrizioni;
	}

	public void setDescrizioni(List<String> descrizioni) {
		this.descrizioni = descrizioni;
	}

	public List<String> getNomeProdottiNonDisponibili() {
		return nomeProdottiNonDisponibili;
	}

	public void setNomeProdottiNonDisponibili(List<String> nomeProdottiNonDisponibili) {
		this.nomeProdottiNonDisponibili = nomeProdottiNonDisponibili;
	}

	public int getPezziTotali() {
		return pezziTotali;
	}

	public void setPezziTotali(int pezziTotali) {
		this.pezziTotali = pezziTotali;
	}

	public int getProdottiNonDisponibili() {
		return prodottiNonDisponibili;
	}

	public void setProdottiNonDisponibili(int prodottiNonDisponibili) {
		this.prodottiNonDisponibili = prodottiNonDisponibili;
	}

	public double getMediaPrezzi() {
		return mediaPrezzi;
	}

	public void setMediaPrezzi(double mediaPrezzi) {
		this.mediaPrezzi = mediaPrezzi;
	}
	
	
}
