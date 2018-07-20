package br.edu.ifpi.ads3.pc.orcamento;

public abstract class Imposto {
	protected final Imposto outroImposto;
	
	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	public Imposto() {
		this.outroImposto = null;
	}

	public abstract double calcula(Orcamento orcamento);
	
	public double calculaOutroImposto(Orcamento orcamento) {
		if (this.outroImposto == null) {
			return 0;
		}
		return outroImposto.calcula(orcamento);
	}
}
