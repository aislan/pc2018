package br.edu.ifpi.ads3.pc.orcamento;

public class EnviadorDeEmail implements AcaoAposGerarNota {
	public void executa(NotaFiscal notaFiscal) {
		System.out.println("Envia a nota por email");
	}
}
