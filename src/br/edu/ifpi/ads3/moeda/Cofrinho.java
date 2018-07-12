package br.edu.ifpi.ads3.moeda;

import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
	List<Moeda> moedas = new ArrayList<>();
	void adiciona(Moeda moeda) {
		moedas.add(moeda);
	}
	double calculaTotal() {
		double soma = 0;
		for (Moeda moeda : moedas) {
			soma += moeda.getValor();
		}
		return soma;
	}
	int quantidadeDeMoedas() {
		return moedas.size();
	}
	int quantidadeDeMoedasCujoValorEh(double valor) {
		int quantidadeMoedas = 0;
		for (Moeda moeda : moedas) {
			if (valor==moeda.getValor()) {
				quantidadeMoedas++;
			}
		}
		return quantidadeMoedas;
	}
	double maiorValorDeMoedaNoCofrinho() {
		double maior = Double.NEGATIVE_INFINITY;
		for (Moeda moeda : moedas) {
			if (moeda.getValor()>maior) {
				maior = moeda.getValor();
			}
		}
		return maior;
	}
}
