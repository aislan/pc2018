package br.edu.ifpi.ads3.pc.orcamento;

public class CalculadoraDeDesconto {
		public double calcula(Orcamento orcamento) {
			Desconto desconto1 = new DescontoPorMaisDeCincoItens();
			Desconto desconto2 = new DescontoPormaisDe500Reais();
			Desconto desconto3 = new SemDesconto();
			desconto1.setProximo(desconto2);
			desconto2.setProximo(desconto3);
			return desconto1.desconta(orcamento);
		}
	
}
