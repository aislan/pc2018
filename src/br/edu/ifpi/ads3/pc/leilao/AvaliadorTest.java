package br.edu.ifpi.ads3.pc.leilao;

import org.junit.Assert;
import org.junit.Test;

public class AvaliadorTest {
	@Test
	public void deveEntenderLancesDeOrdemCrescente() {
		//cenário
		Usuario luis = new Usuario("Luis Gustavo");
		Usuario udeilson = new Usuario("Udeilson");
		Usuario ulises = new Usuario("Ulises");
		Leilao leilao = new Leilao("Playstation 4");
		leilao.propoe(new Lance(luis, 1500.00));
		leilao.propoe(new Lance(udeilson, 2000.00));
		leilao.propoe(new Lance(ulises, 2100.00));
		//ação
		Avaliador leiloeiro = new Avaliador();
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
		Usuario luis = new Usuario("Luis Gustavo");
		Usuario udeilson = new Usuario("Udeilson");
		Usuario ulises = new Usuario("Ulises");
		Leilao leilao = new Leilao("Playstation 4");
		leilao.propoe(new Lance(luis, 2100.00));
		leilao.propoe(new Lance(udeilson, 2000.00));
		leilao.propoe(new Lance(ulises, 1500.00));
		//ação
		Avaliador leiloeiro = new Avaliador();
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
		Usuario luis = new Usuario("Luis Gustavo");
		Usuario udeilson = new Usuario("Udeilson");
		Usuario ulises = new Usuario("Ulises");
		Leilao leilao = new Leilao("Playstation 4");
		leilao.propoe(new Lance(luis, 2000.00));
		leilao.propoe(new Lance(udeilson, 2100.00));
		leilao.propoe(new Lance(ulises, 1500.00));
		//ação
		Avaliador leiloeiro = new Avaliador();
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
		Usuario ulises = new Usuario("Ulises");
		Leilao leilao = new Leilao("Playstation 4");
		
		leilao.propoe(new Lance(ulises, 1500.00));
		//ação
		Avaliador leiloeiro = new Avaliador();
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
		Usuario luis = new Usuario("Luis Gustavo");
		Usuario udeilson = new Usuario("Udeilson");
		Usuario ulises = new Usuario("Ulises");
		Usuario liniker = new Usuario("Linider");
		Leilao leilao = new Leilao("Playstation 4");
		leilao.propoe(new Lance(luis, 1500.00));
		leilao.propoe(new Lance(udeilson, 2000.00));
		leilao.propoe(new Lance(ulises, 2100.00));
		leilao.propoe(new Lance(liniker, 2800.00));
		//ação
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		//saída
		Assert.assertEquals(3, leiloeiro.getMaiores().size());
		for (Lance lance : leiloeiro.getMaiores()) {
			System.out.println(lance.getValor());
		}
	}
}
