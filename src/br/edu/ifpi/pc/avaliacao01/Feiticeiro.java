package br.edu.ifpi.pc.avaliacao01;

public class Feiticeiro {
	private String nome;
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	String mandinga (Vudu vudu, Aluno aluno) {
		return vudu.maldicao(aluno.getNome());
	}
	String mandinga (Vudu vudu, Aluno aluno, String efeito) {
		return vudu.maldicao(aluno.getNome(),efeito);
	}
}
