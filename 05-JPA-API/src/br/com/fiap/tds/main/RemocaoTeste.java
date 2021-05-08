package br.com.fiap.tds.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.tds.entity.Endereco;

public class RemocaoTeste {
	public static void main(String[] args) {
		
		//Obter a fabrica e o entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		//Pesquisar o endereco que sera removido
		Endereco end = em.find(Endereco.class, 1);
		
		//Chamar o metodo remover(marcar o end com o status removed)
		em.remove(end);
		
		//Commit
		em.getTransaction().begin();
		em.getTransaction().commit();
		System.out.println("Endere�o Removido!");
		//Fechar
		em.close();
		fabrica.close();
		
		
		
		
	}

}
