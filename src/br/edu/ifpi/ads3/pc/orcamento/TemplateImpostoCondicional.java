package br.edu.ifpi.ads3.pc.orcamento;

public abstract class TemplateImpostoCondicional extends Imposto {
	public TemplateImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	public TemplateImpostoCondicional() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento) +calculaOutroImposto(orcamento);
		} else {
			return minimaTaxacao(orcamento) + calculaOutroImposto(orcamento);
		}
	}

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);
	public abstract double maximaTaxacao(Orcamento orcamento);
	public abstract double minimaTaxacao(Orcamento orcamento);
}
