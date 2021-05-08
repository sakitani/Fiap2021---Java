package br.com.fiap.tds.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.tds.entity.Endereco;

public class PesquisarTeste {
	public static void main(String[] args) {
		
		//Obter a fabrica e o entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		//Pesquisar o endereco de codigo
		Endereco end = em.find(Endereco.class, 1);
		
		//Exibir os dados do enredeco
		System.out.println(end);
		

		
		//Fechar
		em.close();
		fabrica.close();
		
	}

}
