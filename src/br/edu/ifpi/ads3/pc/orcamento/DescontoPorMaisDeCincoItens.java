package br.edu.ifpi.ads3.pc.orcamento;

public class DescontoPorMaisDeCincoItens implements Desconto {
	private Desconto proximo;
	public double desconta (Orcamento orcamento) {
		double resultado = 0;
		if (orcamento.getItens().size()>5) {
			resultado = orcamento.getValor() * 0.1;
			return resultado;
		} else {
			return proximo.desconta(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}
}
