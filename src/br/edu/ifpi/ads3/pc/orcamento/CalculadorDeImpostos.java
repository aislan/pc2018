package br.edu.ifpi.ads3.pc.orcamento;

public class CalculadorDeImpostos {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double valor = imposto.calcula(orcamento);
		System.out.println(valor);
	}
}
