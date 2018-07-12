package br.edu.ifpi.pc.avaliacao01;

import java.util.ArrayList;
import java.util.List;

public class TesteAplicacao {
	public static void main(String[] args) {
		Boneco boneco = new Boneco();
		boneco.setNome("João Paulo");
		Mamulengo mamulengo = new Mamulengo();
		mamulengo.setNome("Jesiel");
		mamulengo.setDanca("Forró");
		Vudu vudu = new Vudu();
		vudu.setNome("Jader");
		Feiticeiro feiticeiro = new Feiticeiro();
		List<Aluno> alunos = new ArrayList<>();
		alunos.add(new Aluno("Ulisses"));
		alunos.add(new Aluno("Maria Aline"));
		alunos.add(new Aluno("Luis Gustavo"));
		alunos.add(new Aluno("Ednan"));
		alunos.add(new Aluno("Liniker"));
		alunos.add(new Aluno("Diago"));
		alunos.add(new Aluno("Udeilson"));
		alunos.add(new Aluno("Kleiton"));
		alunos.add(new Aluno("Willian"));
		for (Aluno aluno : alunos) {
			System.out.println(feiticeiro.mandinga(vudu, aluno));
		}
		System.out.println("===============================");
		List<String> efeitos = new ArrayList<>();
		efeitos.add("Feiura");
		efeitos.add("Liseira");
		efeitos.add("Diarréia");
		efeitos.add("Abirobado");
		efeitos.add("Bucho quebrado");
		efeitos.add("Chulé");
		efeitos.add("Boca podre");
		efeitos.add("Perna Torta");
		efeitos.add("Feiura");
		int i = 0;
		for (Aluno aluno : alunos) {
			System.out.println(feiticeiro.mandinga(vudu, aluno, efeitos.get(i++)));
		}
		System.out.println("===============================");
		List<Boneco> bonecos = new ArrayList<>();
		bonecos.add(boneco);
		bonecos.add(mamulengo);
		bonecos.add(vudu);
		for (Boneco b : bonecos) {
			System.out.println(b.getInfo());
		}
	}
}
