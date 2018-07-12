package br.edu.ifpi.pc.lang;

public class TesteString {
	public static void main(String[] args) {
		String nome = "Alyne";
		String[] letras = nome.split("");
		String nomeaoContrario = "";
		for (int i = letras.length-1; i >= 0  ; i--) {
			nomeaoContrario += letras[i];
		}
		System.out.println(nomeaoContrario.toLowerCase());
	}
}
