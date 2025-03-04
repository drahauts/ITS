package com.spring.university;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringUniDemoApplication {

	@Autowired
	DataBaseProduzione db;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringUniDemoApplication.class, args);
	}
	
	@GetMapping("/test")
	public void test() {
		db.nomeDb  ="Oracle";
		System.out.println(db.nomeDb);
	}

}