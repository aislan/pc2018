package br.edu.ifpi.ads3.moeda;

import java.util.ArrayList;
import java.util.List;

public class Data {
	int dia,mes,ano;

	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	boolean verificaBisexto(){
		return ano % 4 == 0;
	}
	String mostraData() {
		return dia+"/"+mes+"/"+ano;
	}
	boolean validaData() {
		boolean resultado = false;
		if (ano>0) {
			if (mes>0 & mes <13) {
				if (dia>=1) {
					List<Integer> dias = new ArrayList<>();
					dias.add(31);
					dias.get(mes-1);
				}
				
			}
		}
		return resultado;
	}
}
