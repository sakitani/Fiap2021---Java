package br.com.fiap.tds.view;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;

import br.com.fiap.tds.dao.GenericDao;
import br.com.fiap.tds.dao.impl.GenericDaoImpl;
import br.com.fiap.tds.entity.Cliente;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.singleton.EntityManagerFactorySingleton;

public class ClienteDaoTeste {
	public static void main(String[] args) throws br.com.fiap.tds.exception.EntityNotFoundException {
		
		//Obter um Entity manager
		EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
		
		//Obter uma instancia de GenericDao para o cliente
		//Definir uma classe anonima e obter a instancia
		GenericDao<Cliente, Integer> dao = new GenericDaoImpl<Cliente, Integer>(em) {
		};
		
		//Cadastrar
		Cliente cliente = new Cliente("Marcos", "123.987.985/0001-01", true);
		try {
			dao.create(cliente);
			dao.commit();
			System.out.println("Cliente Cadastroado");
		} catch (CommitException e) {
			System.out.println(e.getMessage());
		}
		//Pesquisar
		try {
			cliente = dao.search(1);
			System.out.println(cliente.getNome() + " " + cliente.getCpf());
		} catch (EntityNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		//Fechar
		em.close();
		EntityManagerFactorySingleton.getInstance().close();
		
		
	}

}
