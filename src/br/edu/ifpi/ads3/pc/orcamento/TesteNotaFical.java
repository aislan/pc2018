package br.edu.ifpi.ads3.pc.orcamento;

public class TesteNotaFical {
	public static void main(String[] args) {
		NotaFiscalBuilder criador = new NotaFiscalBuilder();
		criador.adicionaAcao(new Impressora());
		criador.adicionaAcao(new EnviadorDeEmail());
		criador.adicionaAcao(new NotaFiscalDao());
		criador
			.paraEmpresa("Paraíba")
			.comCNPJ("12233")
			.comItem(new ItemDaNota("bicicleta",1,1000.00))
			.comItem(new ItemDaNota("notebook",1,6000.00))
			.comItem(new ItemDaNota("tenis",1,300.00))
			.comObservacoes("Não parcela, se não vc se dá mal")
			.naDataAtual();
		NotaFiscal nota = criador.constroi();
	}
}
