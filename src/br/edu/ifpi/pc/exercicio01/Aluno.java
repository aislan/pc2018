package br.edu.ifpi.pc.exercicio01;

public class Aluno {
	String nome;
	String sobreNome;
	String matricula;
	double[] notas;
	int totalNotas;
	public Aluno(String nome, String sobreNome, String matricula) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.matricula = matricula;
	}
	public String nomeCompleto() {
		return this.nome + " " + this.sobreNome;
	}
	public void carregaMatrizDeNotas(int tamanho) {
		this.notas = new double[tamanho];
	}
	public void adicionaNota(double nota) {
		if (totalNotas < notas.length) {
			this.notas[this.totalNotas] = nota;
			this.totalNotas++;
		} else {
			throw new EstouroDeNotasException();
		}	
	}
	public void mostrarNotas() {
		for (int i = 0; i < totalNotas; i++) {
			System.out.println("A nota["+(i+1)+"]: "+notas[i]);
		}
	}
	public double calculaMedia() {
		double soma = 0 ;
		for (int i = 0; i < totalNotas; i++) {
			soma = soma + notas[i];
		}
		return soma/totalNotas;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.nomeCompleto() + "     " + this.matricula;
	}
}
