package br.edu.ifpi.pc.avaliacao01;

public class Vudu extends Boneco {
	String maldicao (String nomeDaVitima) {
		return nomeDaVitima + " vai ter dor de barriga";
	}
	String maldicao (String nomeDaVitima, String efeito) {
		return nomeDaVitima + " " + efeito;
	}
}
