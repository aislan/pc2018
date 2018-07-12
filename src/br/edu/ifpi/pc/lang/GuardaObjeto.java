package br.edu.ifpi.pc.lang;

public class GuardaObjeto {
	private Object[] arrayDeObjetos = new Object[100];
	private int posicao = 0;
	
	public void adicionaObjeto (Object object) {
		this.arrayDeObjetos[this.posicao] = object;
		this.posicao++;
	}
	public Object pegaObjeto(int indice) {
		return this.arrayDeObjetos[indice];
	}
}
