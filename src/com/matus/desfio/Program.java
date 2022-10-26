package com.matus.desfio;

import com.matus.desfio.entities.Curso;
import com.matus.desfio.entities.Mentoria;

public class Program {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo(" Curso java");
		curso1.setDescricao(" Aprendendo POO");
		curso1.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria();
		
		
		
		System.out.println(curso1);
	}

}
