package com.matus.desfio.entities;

import java.time.LocalDate;



public class Mentoria extends Conteudo{
	private LocalDate data;
	
	@Override
	public double calcularXp() {
		return XP_PADRAO + 25.5d;
	}
	
	public Mentoria() {

	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "A mentoria \n " + getTitulo() +" \n" + getDescricao()+" no dia " + data ;
	}
	
	
	
}
