package br.edu.ifpi.ads3.financas;

import javax.persistence.EntityManager;

import br.edu.ifpi.ads3.financas.modelo.Cliente;
import br.edu.ifpi.ads3.financas.modelo.Conta;
import br.edu.ifpi.ads3.financas.util.JPAUtil;

public class TesteContaCliente {
	public static void main(String[] args) {
		Cliente c = new Cliente();
		c.setEndereco("Paroquial");
		c.setNome("Ulisses");
		c.setProfissao("Desenvolvedor");
		
		Cliente c2 = new Cliente();
		c2.setEndereco("Paroquial");
		c2.setNome("Luis Gustavo");
		c2.setProfissao("Desenvolvedor");
		
		Conta conta = new Conta();
		conta.setId(2);
		
		c.setConta(conta);
		c2.setConta(conta);
		
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		em.persist(c);
		em.persist(c2);
		em.getTransaction().commit();
		em.close();
	}
}
