package br.edu.ifpi.ads3.pc;

public class Teste {
	public static void main(String[] args) {
		System.out.println("Início do método main");
		try {
			metodo1();
		}catch (Exception e) {
			System.out.println("deu merda");
		}
		
		System.out.println("Fim do método main");
	}

	private static void metodo1() {
		System.out.println("Início do Método 1");
		
			metodo2();
		
		
		System.out.println("Fim do método 1");
	}

	private static void metodo2() {
		System.out.println("Início do Método 2");
		int[] matriz = new int[10];
			for (int i = 10; i < 15; i++) {
				matriz[i]=i;
			System.out.println(i);
			}
		System.out.println("Fim do método 2");
	}
}
