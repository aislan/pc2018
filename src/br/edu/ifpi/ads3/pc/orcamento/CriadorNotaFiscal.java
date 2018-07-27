package br.edu.ifpi.ads3.pc.orcamento;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CriadorNotaFiscal {
	private String razaoSocial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private double valorBruto;
	private double impostos;
	private List<ItemDaNota> itens = new ArrayList<>();
	private String observacoes;
	public void paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public void comCNPJ(String cnpj) {
		this.cnpj = cnpj;
	}
	public void comItem(ItemDaNota item) {
		itens.add(item);
		this.valorBruto += item.getValorTotal();
		this.impostos += item.getValorTotal() * 0.05;
	}
}
