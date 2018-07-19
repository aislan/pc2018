package br.edu.ifpi.ads3.pc.orcamento;

public class TesteImposto {
	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(10000);
		CalculadorDeImpostos c = new CalculadorDeImpostos();
		c.realizaCalculo(orcamento, new MariaAline());
		c.realizaCalculo(orcamento, new ISS());
		c.realizaCalculo(orcamento, new ICMS());
	}
}
