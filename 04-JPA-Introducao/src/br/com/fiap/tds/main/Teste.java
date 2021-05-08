package br.com.fiap.tds.main;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Teste {
	public static void main(String[] args) {
	
		//Tem que se criar uma fabrica de entity manager - fabrica de conexão
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		//Obter um objeto que gerencia os entidades EntityManager - chama como uma entidade para executar a fabrica
		EntityManager em = fabrica.createEntityManager();
		
		//Fechar
		em.close();
		fabrica.close();
		
	}
}
