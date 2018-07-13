package br.edu.ifpi.ads3.pc.orcamento;

public class MariaAline implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.5;
	}

}
