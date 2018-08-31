package br.edu.ifpi.ads3.financas;

import javax.persistence.EntityManager;

import br.edu.ifpi.ads3.financas.modelo.Conta;
import br.edu.ifpi.ads3.financas.util.JPAUtil;
public class TesteBuscaConta {
	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		Conta conta = em.find(Conta.class, 1);
		System.out.println("Titular: " + conta.getTitular());
		conta.setTitular("Maria Allyne");
		em.getTransaction().commit();
		em.close();
	}
}
