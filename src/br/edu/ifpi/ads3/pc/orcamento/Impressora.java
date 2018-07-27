package br.edu.ifpi.ads3.pc.orcamento;

public class Impressora implements AcaoAposGerarNota {
	public void executa (NotaFiscal notafiscal) {
		System.out.println("Imprime Nota Fiscal");
	}
}
