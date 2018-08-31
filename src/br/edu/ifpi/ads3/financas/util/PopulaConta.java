package br.edu.ifpi.ads3.financas.util;

import javax.persistence.EntityManager;

import br.edu.ifpi.ads3.financas.modelo.Conta;

public class PopulaConta {
 public static void main(String[] args) {
	Conta c = new Conta();
	c.setAgencia("123");
	c.setBanco("BB");
	c.setNumero("1234567");
	c.setTitular("Liniker");
	
	Conta c2 = new Conta();
	c2.setAgencia("123");
	c2.setBanco("BB");
	c2.setNumero("3030");
	c2.setTitular("Daniel");
	
	Conta c3 = new Conta();
	c3.setAgencia("123");
	c3.setBanco("BB");
	c3.setNumero("127");
	c3.setTitular("Ednan");
	
	EntityManager em = new JPAUtil().getEntityManager();
	em.getTransaction().begin();
	em.persist(c);
	em.persist(c2);
	em.persist(c3);
	em.getTransaction().commit();
	em.close();
}
}
