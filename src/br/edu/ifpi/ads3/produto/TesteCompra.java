package br.edu.ifpi.ads3.produto;

public class TesteCompra {
	public static void main(String[] args) {
		CarrinhoDeCompras c = new CarrinhoDeCompras();
		c.adicionaProduto(new Produto("notebook", 2500.00));
		c.adicionaProduto(new Produto("arroz", 10.00));
		c.adicionaProduto(new Produto("feijão", 5.00));
		c.adicionaProduto(new Produto("macarrão", 3.00));
		c.adicionaProduto(new Produto("picanha", 28.00));
		MaiorEMenor m = new MaiorEMenor();
		m.encontra(c);
		System.out.println("maior" + m.maior.getNome());
		System.out.println("menor" + m.menor.getNome());
	}
}
