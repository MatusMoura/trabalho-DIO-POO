package com.matus.desfio;

import com.matus.desfio.entities.Curso;
import com.matus.desfio.entities.Mentoria;
import com.matus.dominio.Bootcamp;
import com.matus.dominio.Dev;

public class Program {

	public static void main(String[] args) {
		
		Curso curso1 = new Curso();
		curso1.setTitulo(" Curso java");
		curso1.setDescricao(" Aprendendo POO");
		curso1.setCargaHoraria(12);
		Curso curso2 = new Curso();
		curso2.setTitulo(" Curso Springboot");
		curso2.setDescricao(" Aprendendo microservice");
		curso2.setCargaHoraria(7);
		
		Mentoria mentoria1 = new Mentoria();
		mentoria1.setTitulo("Zerando duvidas de POO");
		mentoria1.setDescricao("entenda tudo sobre POO com Camila Calvacante");
		
		Mentoria mentoria2 = new Mentoria();
		mentoria1.setTitulo("Primeira API Springboot");
		mentoria1.setDescricao("entenda tudo sobre Springboot com Camila Calvacante");
	
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp java developer");
		bootcamp.setDescricão("\n Não perca bootcamp incrivel de java na DIO\n entenda tudo sobre esse ecosistema incrivel!!!\n#### com professores incriveis! ###");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria1);
		bootcamp.getConteudos().add(mentoria2);
		
		Dev devMatus = new Dev();
		devMatus.setNome("Matus Moura");
		devMatus.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos: "+ devMatus.getConteudosInscritos());
		devMatus.progredir();
		System.out.println("Conteudos Inscritos: "+ devMatus.getConteudosInscritos());
		System.out.println();
		System.out.println("Conteudos concluidos:" + devMatus.getNome() + devMatus.getConteudosConcluidos());
		System.out.println("XP: "+ devMatus);
		
		System.out.println("_______________________________________________");
		System.out.println();
		System.out.println("_______________________________________________");
		System.out.println();
		
		Dev devBia = new Dev();
		devBia.setNome("Beatriz Vaz");
		devBia.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos: "+ devBia.getConteudosInscritos());
		devBia.progredir();
		devBia.progredir();
		System.out.println("-");
		System.out.println("Conteudos Inscritos: "+ devBia.getConteudosInscritos());
		System.out.println();
		System.out.println("Conteudos concluidos:" + devBia.getNome() + devBia.getConteudosConcluidos());
		System.out.println("XP: "+ devBia);
	}
}
