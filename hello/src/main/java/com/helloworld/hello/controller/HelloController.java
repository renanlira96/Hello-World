package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello Generation!!!" + "\n Mentalidades e Orientação ao futuro"+"\nResponsabilidade Pessoal"
	+"\nMentalidade de Crescimento" +"\n Objetivos de aprendizagem desta semana."
	+"\nPersistência"
	+"\nHabilidades"
	+"\nTrabalho em equipe"
	+"\nAtenção aos Detalhes"
	+"\nProatividade"
	+"\nComunicação"
	+"\nAperfeiçoar os conhecimentos sobre banco de dados.";
	}

}
