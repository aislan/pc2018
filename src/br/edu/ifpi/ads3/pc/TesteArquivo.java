package br.edu.ifpi.ads3.pc;

import java.io.FileNotFoundException;

public class TesteArquivo {
	public static void main(String[] args) {
		try {
			metodo();
			System.out.println("Deu certo!");
		} catch (FileNotFoundException e) {
			System.out.println("Erro foi " + e.getMessage());
		}
	}
	public static void metodo() throws FileNotFoundException {
			new java.io.FileReader("teste.txt");
	}
}
