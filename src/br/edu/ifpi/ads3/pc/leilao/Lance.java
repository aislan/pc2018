package br.edu.ifpi.ads3.pc.leilao;

public class Lance implements Comparable<Lance>{
	private Usuario usuario;
	private double valor;
	public Lance(Usuario usuario, double valor) {
		this.usuario = usuario;
		this.valor = valor;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public double getValor() {
		return valor;
	}
	@Override
	public int compareTo(Lance outroLance) {
		int retorno = 0;
		if (outroLance.getValor()>this.getValor()) {
			retorno = 1;
		}
		if (outroLance.getValor()<this.getValor()) {
			retorno = -1;
		}
		return retorno;
	}
}
