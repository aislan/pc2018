package br.edu.ifpi.ads3.pc.colecoes;

import java.util.Collections;

public class TesteCurso {
	public static void main(String[] args) {
		Curso curso = new Curso("Programação Corporativa", "Aislan Rafael");
		curso.adicionaAula(new Aula("Coleções",30));
		curso.adicionaAula(new Aula("Trabalhando com ArrayList",10));
		curso.adicionaAula(new Aula("Conjunto",5));
		curso.adicionaAula(new Aula("Reflexão",3));
		System.out.println(curso.getTempoTotal());
		for (Aula aula: curso.getAulas()) {
			System.out.println(aula);
		}
	}
}
