package br.edu.ifpi.ads3.pc.leilao;

import java.util.ArrayList;
import java.util.List;

public class Leilao {
	private String descricao;
	List<Lance> lances = new ArrayList<>();
	public Leilao(String descricao) {
		this.descricao = descricao;
	}
	void propoe (Lance lance) {
		
		if ((lances.isEmpty() || !ultimoLanceDado().getUsuario().equals(lance.getUsuario()))
				&& quantidadeDeLanceDoUsuario(lance.getUsuario()) <5 ){
			lances.add(lance);
		}
		
	}
	private int quantidadeDeLanceDoUsuario(Usuario usuario) {
		int total = 0;
		for (Lance l : lances) {
			if (l.getUsuario().equals(usuario)) total++;
		}
		return total;
	}
	private Lance ultimoLanceDado() {
		return lances.get(lances.size()-1);
	}
	public String getDescricao() {
		return descricao;
	}
	public List<Lance> getLances() {
		return lances;
	}
}
