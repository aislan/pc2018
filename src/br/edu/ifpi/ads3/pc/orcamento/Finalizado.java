package br.edu.ifpi.ads3.pc.orcamento;

import javax.management.RuntimeErrorException;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento finalizado não recebe desconto extra");
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já finalizado");
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já finalizado");
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		// não faz nada pois o mesmo já está finalizado
		
	}

}
