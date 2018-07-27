package br.edu.ifpi.ads3.pc.orcamento;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private Calendar dataDeEmissao;
	private double valorBruto;
	private double impostos;
	private List<ItemDaNota> itens = new ArrayList<>();
	private String observacoes;
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	public NotaFiscalBuilder comCNPJ(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	public NotaFiscalBuilder comItem(ItemDaNota item) {
		itens.add(item);
		this.valorBruto += item.getValorTotal();
		this.impostos += item.getValorTotal() * 0.05;
		return this;
	}
	public NotaFiscalBuilder comObservacoes(String observacao) {
		this.observacoes = observacao;
		return this;
	}
	public NotaFiscalBuilder naDataAtual() {
		this.dataDeEmissao = Calendar.getInstance();
		return this;
	}
	public NotaFiscal constroi() {
		return new NotaFiscal(razaoSocial, cnpj, dataDeEmissao, valorBruto, 
				impostos, itens, observacoes);
	}
}
