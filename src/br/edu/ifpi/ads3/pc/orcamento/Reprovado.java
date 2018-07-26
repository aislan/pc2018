package br.edu.ifpi.ads3.pc.orcamento;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento reprovado não recebe desconto");
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já reprovado, não pode mais "
				+ "ser aprovado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		// não faz nada pois já está reprovado
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}
	
}
