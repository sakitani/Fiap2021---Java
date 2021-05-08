package br.com.fiap.tds.main;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.tds.entity.Endereco;
import br.com.fiap.tds.entity.TipoEndereco;

public class CadastroTeste {
	public static void main(String[] args) {
		
		//Obter uma fabrica e um entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		//Instanciar um endereco sem o codigo(EStado: novo - não 
		Endereco end = new Endereco("04276000", "Rua Salvador Simoes", 1010, true, TipoEndereco.CASA);
		
		//Coloca o endereço no contexto do entity manager (gerenciado)
		em.persist(end);
		
		//Iniciar uma transação
		em.getTransaction().begin();
		
		//Commit
		em.getTransaction().commit();
		
		//Fechar
		em.close();
		fabrica.close();		
		
	}
}
