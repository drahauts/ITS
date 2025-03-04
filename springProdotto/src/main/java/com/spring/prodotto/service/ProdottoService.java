package com.spring.prodotto.service;

import java.util.ArrayList;
import java.util.List;

import com.spring.prodotto.dao.ProdottoDAOMappa;
import com.spring.prodotto.dto.ProdottoDTO;
import com.spring.prodotto.dto.ProdottoNoIdDTO;
import com.spring.prodotto.entity.Prodotto;
import com.spring.prodotto.utility.Conversioni;

public class ProdottoService {
	private ProdottoDAOMappa dao = new ProdottoDAOMappa();
	
	
	public void aggiungiProdotto(ProdottoDTO prodottoDTO) {
		Prodotto prodotto = Conversioni.daProdottoDTOaProdotto(prodottoDTO);
		
		dao.salvaProdotto(prodotto);
	}
	
	public List<ProdottoNoIdDTO> getTuttiProdottiNoId(){
		List<Prodotto> prodotti = dao.findAll();
		List<ProdottoNoIdDTO> prodottiNoId = new ArrayList<>();
		
		for (Prodotto prodotto : prodotti) {
			prodottiNoId.add(Conversioni.daProdottoAProdottoNoIdDTO(prodotto));
		}
		
		return prodottiNoId;
	}
	
	public ProdottoDTO getProdottoPerId(int id) {
		Prodotto prodotto = dao.findById(id);
		
		if(prodotto!= null) {
			ProdottoDTO dto = Conversioni.daProdottoAProdottoDTO(prodotto);
			return dto;
		}
		return null;
	}
	
	

}
