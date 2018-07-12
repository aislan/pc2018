package br.edu.ifpi.ads3.produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
	
	private List<Produto> produtos;
	
	public CarrinhoDeCompras() {
		produtos = new ArrayList<>();
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	void adicionaProduto(Produto produto) {
		
		produtos.add(produto);
		
	}
}
