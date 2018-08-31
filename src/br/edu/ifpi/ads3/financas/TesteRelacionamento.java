package br.edu.ifpi.ads3.financas;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.EntityManager;

import br.edu.ifpi.ads3.financas.modelo.Conta;
import br.edu.ifpi.ads3.financas.modelo.Movimentacao;
import br.edu.ifpi.ads3.financas.modelo.TipoMovimentacao;
import br.edu.ifpi.ads3.financas.util.JPAUtil;

public class TesteRelacionamento {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setAgencia("1");
		conta.setBanco("Nubank");
		conta.setNumero("1234");
		conta.setTitular("João Paulo");
		
		Movimentacao m = new Movimentacao();
		m.setData(Calendar.getInstance());
		m.setDescricao("Churracaria");
		m.setTipo(TipoMovimentacao.SAIDA);
		m.setValor(new BigDecimal("500.00"));
		m.setConta(conta);
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(conta);
		em.persist(m);
		em.getTransaction().commit();
		em.close();
	}
}
