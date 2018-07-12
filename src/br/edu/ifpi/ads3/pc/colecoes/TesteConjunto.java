package br.edu.ifpi.ads3.pc.colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class TesteConjunto {
	public static void main(String[] args) {
		Set<String> conjunto = new HashSet<>();
		conjunto.add("Luis gustavo");
		//conjunto.add("Maria Allyne");
		//conjunto.add("Maria Allyne");
		conjunto.add("Diagol");
		conjunto.add("Whashington");
		conjunto.add("joão");
		conjunto.add("maria");
		conjunto.add("Zezinho");
		conjunto.add("petunia");
		conjunto.add("aberlardo");
		System.out.println("Maria Allyne está no conjunto? " + 
		conjunto.contains("Maria Allyne"));
		
	}
}
