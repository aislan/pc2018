package br.edu.ifpi.ads3.pc.orcamento;

public class ItemDaNota {
	private String descricao;
	private int quantidade;
	private double valor;
	
	public ItemDaNota(String descricao, int quantidade, double valor) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValorTotal() {
		return valor * quantidade;
	}
	
}
