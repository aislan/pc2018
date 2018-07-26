package br.edu.ifpi.ads3.pc.orcamento;

public class Aprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.setValor(orcamento.getValor() * 0.98);
	}

	@Override
	public void aprova(Orcamento orcamento) {
		// não faz nada pois o orçamento já está aprovado		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já aprovado e o mesmo não pode mais"
				+ " ser reprovado");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
		
	}

}
