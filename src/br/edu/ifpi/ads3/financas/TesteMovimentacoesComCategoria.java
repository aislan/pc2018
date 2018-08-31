package br.edu.ifpi.ads3.financas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.edu.ifpi.ads3.financas.modelo.Categoria;
import br.edu.ifpi.ads3.financas.modelo.Conta;
import br.edu.ifpi.ads3.financas.modelo.Movimentacao;
import br.edu.ifpi.ads3.financas.modelo.TipoMovimentacao;
import br.edu.ifpi.ads3.financas.util.JPAUtil;

public class TesteMovimentacoesComCategoria {
	public static void main(String[] args) {
		Categoria c = new Categoria();
		c.setNome("Viagem");
		Categoria c2 = new Categoria();
		c2.setNome("Negocio");
		Conta conta = new Conta();
		conta.setId(2);
		
		Movimentacao m = new Movimentacao();
		m.setData(Calendar.getInstance());
		m.setDescricao("Viagem a Recife");
		m.setTipo(TipoMovimentacao.SAIDA);
		m.setValor(new BigDecimal("2000.00"));
		m.setCategorias(Arrays.asList(c,c2));
		m.setConta(conta);
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.persist(c2);
		conta = em.find(Conta.class, 2);
		em.persist(m);
		em.getTransaction().commit();
		em.close();
	}
}
