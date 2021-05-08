package br.com.fiap.tds.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.tds.entity.Endereco;
import br.com.fiap.tds.entity.TipoEndereco;

public class AtualizacaoTeste {
	
	public static void main(String[] args) {
		
	
	//Obter a fabrica e o entity manager
	EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
	EntityManager em = fabrica.createEntityManager();
	
	//Instanciar um endere�o com o codigo (EStado detached)
	Endereco end = new Endereco(1, "04279000", "Rua Tereza", 2010, true, TipoEndereco.COMERCIAL);
	
	Endereco enderecoGerenciado = em.merge(end);
	
	//merge cria um novo dado para ser inserido j� na memoria de gest�o de persistencia
//	Entao se fizesse end.getCep("00301400") n�o funciona mas o enderecoGerenciado.getCep("00301400") sim
	
	em.getTransaction().begin();
	em.getTransaction().commit();
	
	//Fechar
	em.close();
	fabrica.close();

	}
}
