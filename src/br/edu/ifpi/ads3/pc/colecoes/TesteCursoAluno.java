package br.edu.ifpi.ads3.pc.colecoes;

public class TesteCursoAluno {
	public static void main(String[] args) {
		Curso curso = new Curso("Programação Corporativa", "Aislan Rafael");
		curso.adicionaAula(new Aula("Coleções",30));
		curso.adicionaAula(new Aula("Trabalhando com ArrayList",10));
		curso.adicionaAula(new Aula("Conjunto",5));
		curso.adicionaAula(new Aula("Reflexão",3));
		
		Aluno a1 = new Aluno("Luis Gustavo",123);
		Aluno a2 = new Aluno("Luis Gustavo",123);
		curso.matricula(a1);
		curso.matricula(new Aluno("Maria Allyne",321));
		curso.matricula(new Aluno("Daniel Nunes",111));
		curso.matricula(new Aluno("Endnan Martins",222));
		
		Aluno a = curso.buscaMatriculado(321);
		System.out.println(a);
		
	}
}
