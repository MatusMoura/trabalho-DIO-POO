package com.matus.dominio;

import java.time.LocalDate;

public class Bootcamp {

	private String nome;
	private String descricão;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(45);
	
	
}
