package com.spring.prodotto.controller;

import com.spring.prodotto.dto.ProdottoDTO;
import com.spring.prodotto.dto.ProdottoNoIdDTO;
import com.spring.prodotto.service.ProdottoService;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prodotti")
public class ProdottoController {
	private ProdottoService service = new ProdottoService();	
	
	@GetMapping(path="/aggiungi", consumes = "application/json")
    public void aggiungiProdotto(ProdottoDTO prodotto) {
        service.aggiungiProdotto(prodotto);
    }

    @GetMapping(path= "/tutti", produces = "applciation/json")
    public List<ProdottoNoIdDTO> getTuttiProdottiNoId() {
        return service.getTuttiProdottiNoId();
    }

    @GetMapping( path ="cerca/{id}", produces = "application/json")
    public ProdottoDTO getProdottoPerId(@PathVariable int id) {
        return service.getProdottoPerId(id);
    }


}
