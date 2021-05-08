package br.com.fiap.tds.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.tds.entity.Endereco;

public class RefreshTeste {
	
	public static void main(String[] args) {
		
	//Obter a fabrica e o entity manager
	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
	EntityManager em = fabrica.createEntityManager();
	
	//Pesquisar o endereço de código
	Endereco end = em.find(Endereco.class, 1);
	
	//Exibir os dados
	System.out.println(end);
	
	//Setar os valores do número e logradouro (no objeto)
	end.setNumero(888);
	end.setLogradouro("Duque de Caxias");
	
	//Exibir os dados
	System.out.println(end);
	
	//Refresh - volta valor original
	em.refresh(end);
	
	//exibir dados
	System.out.println(end);
	
	//Fechar
	em.close();
	fabrica.close();

	}
}
