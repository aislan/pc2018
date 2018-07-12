package br.edu.ifpi.ads3.produto;

public class MaiorEMenor {
	Produto maior;
	Produto menor;
	public Produto getMaior() {
		return maior;
	}
	public void setMaior(Produto maior) {
		this.maior = maior;
	}
	public Produto getMenor() {
		return menor;
	}
	public void setMenor(Produto menor) {
		this.menor = menor;
	}
	void encontra(CarrinhoDeCompras carrinhodecompras) {
		this.maior = new Produto("",Double.NEGATIVE_INFINITY);
		this.menor = new Produto("",Double.POSITIVE_INFINITY);
		for (Produto produto : carrinhodecompras.getProdutos()) {
			if (produto.getValor()>maior.getValor()) {
				maior = produto;
			}
			if (produto.getValor()<menor.getValor()) {
				menor = produto;
			}
		}
	}
}
