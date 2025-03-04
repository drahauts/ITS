package com.spring.prodotto.utility;

import com.spring.prodotto.dto.ProdottoDTO;
import com.spring.prodotto.dto.ProdottoNoIdDTO;
import com.spring.prodotto.entity.Prodotto;

public class Conversioni {
	
	public static Prodotto daProdottoDTOaProdotto(ProdottoDTO dto) {
		if (dto == null) return null;
		return new Prodotto(dto.getId(), dto.getQuantita(), dto.getMarca(), dto.getModello(), dto.getDescrizione(),dto.getCategoria(), dto.getPrezzoConsigliato(), dto.getPrezzoMassimo());
	}
	
	public static ProdottoDTO daProdottoAProdottoDTO(Prodotto entity) {
		if(entity == null) return null;
		return new ProdottoDTO(entity.getId(), entity.getQuantita(),entity.getMarca(), entity.getModello(), entity.getDescrizione(), entity.getCategoria(), entity.getPrezzoConsigliato(),entity.getPrezzoMassimo());
	}
	
	public static ProdottoNoIdDTO daProdottoAProdottoNoIdDTO(Prodotto entity) {
		if(entity == null) return null;
		return new ProdottoNoIdDTO(entity.getQuantita(), entity.getMarca(), entity.getModello(), entity.getDescrizione(), entity.getCategoria(), entity.getPrezzoConsigliato(), entity.getPrezzoMassimo());
	}
	
}