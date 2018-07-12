package br.edu.ifpi.pc.avaliacao01;

public class Mamulengo extends Boneco {
	private String danca;
	public String getDanca() {
		return danca;
	}
	public void setDanca(String danca) {
		this.danca = danca;
	}
	@Override
	public String getInfo() {
		return "Nome: " + super.getInfo() + " Dança: " + danca;
	}
}
