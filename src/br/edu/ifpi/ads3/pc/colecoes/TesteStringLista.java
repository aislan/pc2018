package br.edu.ifpi.ads3.pc.colecoes;

import java.util.ArrayList;
import java.util.Collections;

public class TesteStringLista {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Daniel");
		nomes.add("Luis Gustavo");
		nomes.add("Maria Aline");
		nomes.add("Maria Aline");
		nomes.add("Antonio");
		nomes.add("Antonio");
		for (String nome : nomes) {
			System.out.println(nome);
		} 
		Collections.sort(nomes);
		System.out.println("==============================");
		for (String nome : nomes) {
			System.out.println(nome);
		} 
	}
}
