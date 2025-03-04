package com.spring.utente.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.utente.dto.ErroreDTO;
import com.spring.utente.dto.NomeCognomeDTO;
import com.spring.utente.dto.UtenteDTO;
import com.spring.utente.service.UtenteService;


@RestController
@RequestMapping(path="/utenti")
public class ControllerUtente {
	
	@Autowired
	private UtenteService service;
	
	@GetMapping(path="/registra", consumes = "application/json")
	public boolean registra(@RequestBody UtenteDTO dto) {
//		System.out.println("Ho registrato l'utente: " + utente);
//		return true;
		
		return service.registra(dto);
	}
	
	
	@GetMapping(path="/cerca/{id}", produces = "application/json")
	public UtenteDTO cercaPerId(@PathVariable int id) {
		//return new Utente(id, "Mario", "Rossi", "mrossi", "mrossi01");
		
		return service.cercaPerId(id);
	}
	
	
//	@GetMapping(path="/mostraTutti", produces = "application/json")
//	public List<UtenteDTO> mostratutti(){
////		ArrayList<Utente> lista = new ArrayList<>();
////		lista.add(new Utente(10, "Mario", "Rossi", "rossim", "red"));
////		lista.add(new Utente(11, "Angelo", "Bianchi", "abianchi", "bho"));
////		lista.add(new Utente(12, "angela", "Rossa", "rossim", "red"));
////		lista.add(new Utente(13, "mario", "Rossi", "rossim", "red"));
////		
////		
////		return lista;
//		return service.mostraTutti();
//	}
	
	@GetMapping(path="/nomeCognome/{id}", produces ="application/json")
	public NomeCognomeDTO getNomeCognome(@PathVariable int id) {
		return service.getNomeCognome(id);
	}
	
	
	@DeleteMapping(path="/elimina/{id}")
	public boolean elimina(@PathVariable int id) {
		return service.eliminaPerId(id);
	}
	
	
	@ExceptionHandler
	public ResponseEntity<ErroreDTO> gestore(RuntimeException exc){
		ErroreDTO errore = new ErroreDTO(exc.getMessage());
		ResponseEntity<ErroreDTO> response = new ResponseEntity<ErroreDTO>(errore, HttpStatus.NOT_FOUND);
		return response;
	}

}