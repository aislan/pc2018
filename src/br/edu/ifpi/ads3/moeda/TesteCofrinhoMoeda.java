package br.edu.ifpi.ads3.moeda;

public class TesteCofrinhoMoeda {
	public static void main(String[] args) {
		Cofrinho c = new Cofrinho();
		c.adiciona(new Moeda(10));
		c.adiciona(new Moeda(10));
		c.adiciona(new Moeda(20));
		c.adiciona(new Moeda(25));
		c.adiciona(new Moeda(25));
		c.adiciona(new Moeda(50));
		c.adiciona(new Moeda(100));
		c.adiciona(new Moeda(100));
		c.adiciona(new Moeda(100));
		c.adiciona(new Moeda(100));
		System.out.println("Meu cofrinho tem R$ " + (c.calculaTotal()/100));
		System.out.println("Tenho " + c.quantidadeDeMoedas() + " moedas");
		System.out.println("Total de moedas de hum real : " + c.quantidadeDeMoedasCujoValorEh(100));
		System.out.println("Maior Valor de moeda no cofrinho é: " + c.maiorValorDeMoedaNoCofrinho()/100);
	}
}
