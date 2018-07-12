package br.edu.ifpi.ads3.pc.leilao;

import org.junit.Assert;
import org.junit.Test;

public class LeilaoTest {
	@Test
	public void naoDeveAceitarDoisLancesSeguidosDoMesmoUsuario() {
		Leilao leilao = new Leilao("Mackbook");
		Usuario ulisses = new Usuario(1,"Ulisses");
		Usuario ulisses2 = new Usuario(1,"Ulisses");
		
		leilao.propoe(new Lance(ulisses, 5000.00));
		leilao.propoe(new Lance(ulisses2, 6000.00));
		
		Assert.assertEquals(1, leilao.getLances().size());
		Assert.assertEquals(5000.00, leilao.getLances().get(0).getValor(),0.000001);
	}
	
	@Test
	public void naoDeveAceitarMaisDoque5LancesDeUmMesmoUsuario() {
		Leilao leilao = new Leilao("Mackbook");
		Usuario ulisses = new Usuario(1,"Ulisses");
		Usuario maria = new Usuario(2,"Maria Alline");
		
		leilao.propoe(new Lance(ulisses, 1000.00));
		leilao.propoe(new Lance(maria, 2000.00));
		leilao.propoe(new Lance(ulisses, 3000.00));
		leilao.propoe(new Lance(maria, 4000.00));
		leilao.propoe(new Lance(ulisses, 5000.00));
		leilao.propoe(new Lance(maria, 6000.00));
		leilao.propoe(new Lance(ulisses, 7000.00));
		leilao.propoe(new Lance(maria, 8000.00));
		leilao.propoe(new Lance(ulisses, 9000.00));
		leilao.propoe(new Lance(maria, 10000.00));
		
		leilao.propoe(new Lance(ulisses, 11000.00));
		Assert.assertEquals(10, leilao.getLances().size());
		
		int ultimo = leilao.getLances().size()-1;
		Lance ultimoLance = leilao.getLances().get(ultimo);
		Assert.assertEquals(10000.00, ultimoLance.getValor(), 0.00001);
		
	}
}
