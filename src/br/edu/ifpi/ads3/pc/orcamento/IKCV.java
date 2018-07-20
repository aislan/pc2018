package br.edu.ifpi.ads3.pc.orcamento;

public class IKCV extends TemplateImpostoCondicional {


	private boolean temItemMaiorQue100ReisNo(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if (item.getValor()>100) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		if (orcamento.getValor()>500 && temItemMaiorQue100ReisNo(orcamento)) {
			return true;
		} 
		return false;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
