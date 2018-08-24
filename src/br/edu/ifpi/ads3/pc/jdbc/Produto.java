package br.edu.ifpi.ads3.pc.jdbc;

public class Produto {
	int id;
	String nome;
	String descricao;
	Categoria categoria;
	public Produto(String nome, String descricao) {
		
		this.nome = nome;
		this.descricao = descricao;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id: " + id + " Nome: " + nome + " Descrição: " + descricao;
	}
}
