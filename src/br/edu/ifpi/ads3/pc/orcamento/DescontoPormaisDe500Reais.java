package br.edu.ifpi.ads3.pc.orcamento;

public class DescontoPormaisDe500Reais implements Desconto {
	private Desconto proximo;
	public double desconta(Orcamento orcamento) {
		double resultado = 0;
		if (orcamento.getValor()>500) {
			resultado = orcamento.getValor() * 0.07;
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
