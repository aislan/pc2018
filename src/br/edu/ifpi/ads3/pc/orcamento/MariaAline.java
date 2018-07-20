package br.edu.ifpi.ads3.pc.orcamento;

public class MariaAline extends Imposto {

	public MariaAline(Imposto outroImposto) {
		super(outroImposto);
		// TODO Auto-generated constructor stub
	}
	public MariaAline() {
		super();
	}

	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.5 + calculaOutroImposto(orcamento);
	}

}
