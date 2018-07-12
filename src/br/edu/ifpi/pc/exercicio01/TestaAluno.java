package br.edu.ifpi.pc.exercicio01;

public class TestaAluno {
	public static void main(String[] args) {
		Aluno gustavo = new Aluno("Luis","Gustavo","20171TADS0060");
		try {
		gustavo.carregaMatrizDeNotas(5);
		gustavo.adicionaNota(5);
		gustavo.mostrarNotas();
		System.out.println("Média "+gustavo.calculaMedia());
		gustavo.adicionaNota(6);
		gustavo.adicionaNota(7);
		gustavo.adicionaNota(8);
		gustavo.mostrarNotas();
		System.out.println("Média "+gustavo.calculaMedia());
		gustavo.adicionaNota(8.5);
		gustavo.adicionaNota(8.8);
		gustavo.mostrarNotas();
		System.out.println("Média "+gustavo.calculaMedia());
		} catch (EstouroDeNotasException e) {
			System.out.println("você tentou colocar mais notas que o permitido");
		} catch (NullPointerException e) {
			System.out.println("Você não criou uma matriz de notas");
		}
		System.out.println(gustavo);
	}
}
