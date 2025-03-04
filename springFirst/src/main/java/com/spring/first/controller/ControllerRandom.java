package com.spring.first.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/random")
public class ControllerRandom {
	
	
	@GetMapping(path="/rNum")
	public List<Integer> nRandom(){
		Random rnd = new Random();
		
		int num;
		List<Integer> numeriCasual = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			num = rnd.nextInt(1, 91);
			if (numeriCasual.contains(num)) {
				System.out.println("Il mio num è: [" + num + "]. Continuo senza aggiungere");
				i--;
				continue;
			}else {
				System.out.println("Il mio num è: [" + num + "]. Aggiungo al mio ArrayList");
				numeriCasual.add(num);
			}
		}
		
		return numeriCasual;
	}

}
