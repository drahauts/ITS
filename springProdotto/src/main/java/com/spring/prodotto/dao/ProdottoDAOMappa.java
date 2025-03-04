package com.spring.prodotto.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.spring.prodotto.dto.ReportDTO;
import com.spring.prodotto.entity.Prodotto;

public class ProdottoDAOMappa {

	private Map<Integer, Prodotto> mappa = new HashMap<>();
	
	public boolean salvaProdotto(Prodotto prodotto) {
		if(mappa.containsKey(prodotto.getId()))
			return false;
		
		mappa.put(prodotto.getId(), prodotto);
		return true;
	}
	
	public List<Prodotto> findAll(){
		return new ArrayList<>(mappa.values());
	}
	
	public Prodotto findById(Integer idProdotto) {
		return mappa.get(idProdotto);
	}
	
	public static ReportDTO generaReportDaProdotti(Collection<Prodotto> prodotti) {
	    
		List<String> descrizioni = new ArrayList<>();
	    List<String> nomeProdottiNonDisponibili = new ArrayList<>();
	    int pezziTotali = 0;
	    int prodottiNonDisponibili = 0;
	    double sommaPrezzi = 0;
	    int conteggioProdotti = 0;

	    for (Prodotto prodotto : prodotti) {
	        descrizioni.add(prodotto.getDescrizione());
	        sommaPrezzi += prodotto.getPrezzoConsigliato();
	        conteggioProdotti++;

	        if (prodotto.getQuantita() == 0) {
	            prodottiNonDisponibili++;
	            nomeProdottiNonDisponibili.add(prodotto.getMarca() + " " + prodotto.getModello());
	        } else {
	            pezziTotali += prodotto.getQuantita();
	        }
	    }

	    double mediaPrezzi;
	    if(conteggioProdotti > 0) {
	    	mediaPrezzi = sommaPrezzi / conteggioProdotti; 
	    }
	    else {
	    	mediaPrezzi = 0;
	    }


	    return new ReportDTO(descrizioni, nomeProdottiNonDisponibili, pezziTotali, prodottiNonDisponibili, mediaPrezzi);
	}
}
