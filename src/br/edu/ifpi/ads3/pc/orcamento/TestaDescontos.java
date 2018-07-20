package br.edu.ifpi.ads3.pc.orcamento;

public class TestaDescontos {
	public static void main(String[] args) {
		CalculadoraDeDesconto c = new CalculadoraDeDesconto();
		
		Orcamento orcamento = new Orcamento(500.00);
		orcamento.adicionaItem(new Item("lapis",250.00));
		orcamento.adicionaItem(new Item("caneta",250.00));
		double desconto = c.calcula(orcamento);
		System.out.println("Desconto: " + desconto);
	}
}
