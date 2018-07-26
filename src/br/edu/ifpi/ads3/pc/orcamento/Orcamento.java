package br.edu.ifpi.ads3.pc.orcamento;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
	
	private double valor;
	private List<Item> itens = new ArrayList<>();
	protected EstadoDeUmOrcamento estadoAtual;
	
	public Orcamento(double valor) {
		this.valor = valor;
		this.estadoAtual = new EmAprovacao();
	}
	
	public double getValor() {
		return valor;
	}
	
	public void adicionaItem(Item item) {
		this.itens.add(item);
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public List<Item> getItens() {
		return itens;
	}
	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	public void aprova() {
		estadoAtual.aprova(this);
	}
	public void reprova() {
		estadoAtual.reprova(this);
	}
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
}
