package br.edu.ifpi.pc.lang;

public class Teste {	
	public static void main(String[] args) {
		GuardaObjeto g = new GuardaObjeto();
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		c1.setSaldo(110);
		c2.setSaldo(100);
		System.out.println(c1.equals(c2));
	}
}
