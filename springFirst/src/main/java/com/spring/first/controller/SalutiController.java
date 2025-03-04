package com.spring.first.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/saluto")
public class SalutiController {

	
	public SalutiController() {
		System.out.println("spring istanzia SalutiController...");
	}
	
	@RequestMapping(path="/generico")
	public String salutoGenerico() {
		return "Hello World!";
	}
	
	@RequestMapping(path="/persona")
	public String salutoPersonalizzato(String nome){
		return "Hello " + nome;
	}
	
	
}
