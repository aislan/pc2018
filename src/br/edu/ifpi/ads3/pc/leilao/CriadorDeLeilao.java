package br.edu.ifpi.ads3.pc.leilao;

public class CriadorDeLeilao {
	
	private Leilao leilao;
	
	public CriadorDeLeilao() {
		
	}
	
	public CriadorDeLeilao para (String descricao) {
		this.leilao = new Leilao(descricao);
		return this;
	}
	
	public CriadorDeLeilao lance (Usuario usuario, double valor) {
		this.leilao.propoe(new Lance(usuario,valor));
		return this;
	}
	
	public Leilao constroi() {
		return this.leilao;
	}
}
