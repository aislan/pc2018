package br.edu.ifpi.ads3.pc.leilao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Avaliador {
	private double maiorDeTodos = Double.NEGATIVE_INFINITY;
	private double menorDeTodos = Double.POSITIVE_INFINITY;
	private List<Lance> maiores = new ArrayList<>();
	public void avalia (Leilao leilao) {
		if (leilao.getLances().size()==0) {
			throw new RuntimeException("Não é possivel avaliar um leilão sem lances");
		}
		for (Lance lance : leilao.getLances()) {
			if (lance.getValor()>maiorDeTodos) {
				maiorDeTodos =lance.getValor();
			} 
			if (lance.getValor()< menorDeTodos) {
				menorDeTodos = lance.getValor();
			}
		}
		pegaOsTresMaioresLanceDo(leilao);
	}
	private void pegaOsTresMaioresLanceDo(Leilao leilao) {
		Leilao ordenaLance = leilao;
		Collections.sort(ordenaLance.getLances());
		int quantidade = 0;
		if (ordenaLance.getLances().size()>3) {
			quantidade = 3;
		} else {
			quantidade = ordenaLance.getLances().size();
		}
		maiores = ordenaLance.getLances().subList(0, quantidade);
		
	}
	public double getMaiorDeTodos() {
		return maiorDeTodos;
	}
	public double getMenorDeTodos() {
		return menorDeTodos;
	}
	public List<Lance> getMaiores() {
		return maiores;
	}
}
