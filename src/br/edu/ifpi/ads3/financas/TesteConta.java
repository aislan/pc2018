package br.edu.ifpi.ads3.financas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifpi.ads3.financas.modelo.Conta;
import br.edu.ifpi.ads3.financas.util.JPAUtil;

public class TesteConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setAgencia("123");
		conta.setBanco("Banco do Brasil");
		conta.setNumero("9088");
		conta.setTitular("Ulisses");
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		em.close();
		
		EntityManager em2 = new JPAUtil().getEntityManager();
		em2.getTransaction().begin();
		conta.setTitular("batman");
		em2.merge(conta);
		em2.getTransaction().commit();
		em2.close();
	
	}
}
