package com.spring.first.controller;

import java.time.LocalDate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/data")
public class DataController {
	
	@RequestMapping(path="/now")
	public LocalDate data() {
		return LocalDate.of(1976, 12, 31); // Create a date object
	}

}
