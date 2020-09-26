package br.com.alura.jpa.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.alura.jpa.modelo.Conta;

public class CriaConta {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("contas");
		EntityManager em = emf.createEntityManager();
		
		Conta conta = new Conta();
		conta.setTitular("Eduardo");
		conta.setAgencia(4733);
		conta.setNumero(2731378);
		
		em.getTransaction().begin();
		
		em.persist(conta);
		
		em.getTransaction().commit();

	}

}
