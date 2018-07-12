package br.edu.ifpi.ads3.pc.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {
	public static void main(String[] args) {
		Aula aula01 = new Aula("PC", 90);
		Aula aula02 = new Aula("POO", 80);
		Aula aula03 = new Aula("ED", 100);
		Aula aula04 = new Aula("BD", 40);
		List<Aula> lista = new ArrayList<>();
		lista.add(aula01);
		lista.add(aula02);
		lista.add(aula03);
		lista.add(aula04);
		for (Aula aula : lista) {
			System.out.println(aula);
		}
		Collections.sort(lista);
		System.out.println("==================================");
		for (Aula aula : lista) {
			System.out.println(aula);
		}
	}
}
