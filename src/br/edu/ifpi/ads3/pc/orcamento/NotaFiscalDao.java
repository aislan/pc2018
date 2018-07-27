package br.edu.ifpi.ads3.pc.orcamento;

public class NotaFiscalDao implements AcaoAposGerarNota {
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Salva no banco a Nota Fiscal");
	}
}
