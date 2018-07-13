package br.edu.ifpi.ads3.pc.leilao;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AvaliadorTest {
	private Avaliador leiloeiro;
	private Usuario luis;
	private Usuario udeilson;
	private Usuario ulises;
	private Usuario liniker;

	@Before
	public void criaAvaliador() {
		this.leiloeiro = new Avaliador();
		this.luis = new Usuario("Luis Gustavo");
		this.ulises = new Usuario("Ulises");
		this.udeilson = new Usuario("Udeilson");
		this.liniker = new Usuario("Liniker");
	}
	
	@Test
	public void deveEntenderLancesDeOrdemCrescente() {
		//cenário
		Leilao leilao = new CriadorDeLeilao().para("Playstation 4")
				.lance(luis, 1500.00)
				.lance(udeilson, 2000.00)
				.lance(ulises, 2100.00)
				.constroi();
		//ação
		leiloeiro.avalia(leilao);
		//saída
		double maiorDeTodosEsperado = 2100.00;
		double menorDeTodosEsperado = 1500.00;
		Assert.assertEquals(maiorDeTodosEsperado, leiloeiro.getMaiorDeTodos(),0.00001);
		Assert.assertEquals(menorDeTodosEsperado, leiloeiro.getMenorDeTodos(),0.00001);
	}
	@Test
	public void deveEntenderLancesDeOrdemDecrescente() {
		//cenário
		
		Leilao leilao = new Leilao("Playstation 4");
		leilao.propoe(new Lance(luis, 2100.00));
		leilao.propoe(new Lance(udeilson, 2000.00));
		leilao.propoe(new Lance(ulises, 1500.00));
		//ação
		leiloeiro.avalia(leilao);
		//saída
		double maiorDeTodosEsperado = 2100.00;
		double menorDeTodosEsperado = 1500.00;
		Assert.assertEquals(maiorDeTodosEsperado, leiloeiro.getMaiorDeTodos(),0.00001);
		Assert.assertEquals(menorDeTodosEsperado, leiloeiro.getMenorDeTodos(),0.00001);
	}
	@Test
	public void deveEntenderLancesDeOrdemAleatoria() {
		//cenário
	
		Leilao leilao = new Leilao("Playstation 4");
		leilao.propoe(new Lance(luis, 2000.00));
		leilao.propoe(new Lance(udeilson, 2100.00));
		leilao.propoe(new Lance(ulises, 1500.00));
		//ação
		leiloeiro.avalia(leilao);
		//saída
		double maiorDeTodosEsperado = 2100.00;
		double menorDeTodosEsperado = 1500.00;
		Assert.assertEquals(maiorDeTodosEsperado, leiloeiro.getMaiorDeTodos(),0.00001);
		Assert.assertEquals(menorDeTodosEsperado, leiloeiro.getMenorDeTodos(),0.00001);
	}
	@Test
	public void deveEntenderLancesComApenasUm() {
		//cenário
		Leilao leilao = new Leilao("Playstation 4");
		
		leilao.propoe(new Lance(ulises, 1500.00));
		//ação
		leiloeiro.avalia(leilao);
		//saída
		double maiorDeTodosEsperado = 1500.00;
		double menorDeTodosEsperado = 1500.00;
		Assert.assertEquals(maiorDeTodosEsperado, leiloeiro.getMaiorDeTodos(),0.00001);
		Assert.assertEquals(menorDeTodosEsperado, leiloeiro.getMenorDeTodos(),0.00001);
	}
	@Test
	public void retornaOsTresMaiores() {
		//cenário
		Leilao leilao = new Leilao("Playstation 4");
		leilao.propoe(new Lance(luis, 1500.00));
		leilao.propoe(new Lance(udeilson, 2000.00));
		leilao.propoe(new Lance(ulises, 2100.00));
		leilao.propoe(new Lance(liniker, 2800.00));
		//ação
		leiloeiro.avalia(leilao);
		//saída
		Assert.assertEquals(3, leiloeiro.getMaiores().size());
		for (Lance lance : leiloeiro.getMaiores()) {
			System.out.println(lance.getValor());
		}
	}
	@Test(expected=RuntimeException.class)
	public void naoDeveAvaliarLeiloesSemNenhumLance() {
			Leilao leilao = new CriadorDeLeilao().para("Playstation 4").constroi();
			leiloeiro.avalia(leilao);
		
	}
}
