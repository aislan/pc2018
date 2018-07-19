package br.edu.ifpi.ads3.pc.orcamento;

public interface Desconto {
	double desconta (Orcamento orcamento);
	void setProximo(Desconto proximo);
}
