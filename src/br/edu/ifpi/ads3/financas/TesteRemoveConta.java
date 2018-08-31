package br.edu.ifpi.ads3.financas;

import javax.persistence.EntityManager;

import br.edu.ifpi.ads3.financas.modelo.Conta;
import br.edu.ifpi.ads3.financas.util.JPAUtil;

public class TesteRemoveConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		conta = em.find(Conta.class, 1);
		em.remove(conta);
		em.getTransaction().commit();
		em.close();
	}
}
