package com.spring.first.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // indica a Spring che dovra istanziare e gestire questa classe
@RequestMapping(path="/calcolatrice")
public class CalcolatriceController {

	
	// qui ci sarebbe il costruttore di DEFAULT
	@GetMapping(path="/sum")
	public int somma(int n1, int n2){
		return n1 + n2;
	}
	
	@GetMapping(path="/sotr")
	public int sottrazzione(int n1, int n2) {
		if(n1 > n2) {
			return n1 - n2;
		}
		else {
			return n2 -n1;
		}
	}
	
	
	@GetMapping(path="/divis")
	public double divisione(double n1, double n2) {
		return n1/n2;
	}
	
	@GetMapping(path="/multi")
	public int multi(int n1, int n2) {
		return n1 * n2;
	}	
}
