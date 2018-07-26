package br.edu.ifpi.ads3.pc.orcamento;

public class TesteDescontoExtra {
	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500);
		reforma.aplicaDescontoExtra();
		System.out.println("Valor do orçamento: " + reforma.getValor());
		reforma.aprova();
		reforma.aplicaDescontoExtra();
		System.out.println("Valor do orçamento: " + reforma.getValor());
		reforma.finaliza();
	}
}
