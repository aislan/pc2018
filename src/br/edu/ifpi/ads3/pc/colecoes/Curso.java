package br.edu.ifpi.ads3.pc.colecoes;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	private String nome;
	private String professor;
	private List<Aula> aulas = new LinkedList<>();
	private Set<Aluno> alunos = new HashSet<>();
	Map<Integer,Aluno> matriculaParaAluno = new HashMap<>();
	
	
	public Curso(String nome, String professor) {
		this.nome = nome;
		this.professor = professor;
	}
	public void adicionaAula(Aula aula) {
		this.aulas.add(aula);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}
	public int getTempoTotal() {
		int total = 0;
		for (Aula aula : this.aulas) {
			total += aula.getCargaHoraria();
		}
		return total;
	}
	public void matricula(Aluno aluno) {
		alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
	}
	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}
	public void setAlunos(Set<Aluno> alunos) {
		this.alunos = alunos;
	}
	public Aluno buscaMatriculado(int matricula) {
		return matriculaParaAluno.get(matricula);
	}
}
