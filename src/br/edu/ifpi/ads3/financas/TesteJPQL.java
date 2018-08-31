package br.edu.ifpi.ads3.financas;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.edu.ifpi.ads3.financas.modelo.Conta;
import br.edu.ifpi.ads3.financas.modelo.Movimentacao;
import br.edu.ifpi.ads3.financas.util.JPAUtil;

public class TesteJPQL {
	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		
		Conta conta = new Conta();
		conta.setId(2);
		
		String jpql = "Select m from Movimentacao m where m.conta = :pConta";
		Query query = em.createQuery(jpql);
		query.setParameter("pConta", conta);
		
		List<Movimentacao> resultados = query.getResultList();
		for (Movimentacao movimentacao : resultados) {
			System.out.println("Descricao: " + movimentacao.getDescricao());
		}
		em.getTransaction().commit();
		em.close();
	}
}
