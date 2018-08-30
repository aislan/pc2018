package br.edu.ifpi.ads3.financas;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifpi.ads3.financas.modelo.Conta;

public class TesteConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setAgencia("123");
		conta.setBanco("Banco do Brasil");
		conta.setNumero("9087");
		conta.setTitular("Maria Allyne");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
}
