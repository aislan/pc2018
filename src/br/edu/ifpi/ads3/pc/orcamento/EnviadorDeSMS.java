package br.edu.ifpi.ads3.pc.orcamento;

public class EnviadorDeSMS implements AcaoAposGerarNota {
	public void executa (NotaFiscal notaFiscal) {
		System.out.println("Envia o aviso de NotaFiscal Por SMS");
	}
}
