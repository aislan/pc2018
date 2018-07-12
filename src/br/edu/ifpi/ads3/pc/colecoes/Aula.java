package br.edu.ifpi.ads3.pc.colecoes;

public class Aula implements Comparable<Aula> {
	private String nome;
	private int cargaHoraria;
	
	public Aula(String nome, int cargaHoraria) {
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public int compareTo(Aula outraAula) {
		if (outraAula.getCargaHoraria()==this.cargaHoraria) {
			return 0;
		} else if (this.cargaHoraria>outraAula.getCargaHoraria()) {
			return 1;
		} else {
			return -1;
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + this.nome + " Carga Horária: " + this.cargaHoraria;
	}
	

}
