package br.com.fiap.tds.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.tds.dao.EnderecoDao;
import br.com.fiap.tds.dao.exception.EnderecoNotFoundException;
import br.com.fiap.tds.dao.impl.EnderecoDaoImpl;
import br.com.fiap.tds.entity.Endereco;
import br.com.fiap.tds.entity.TipoEndereco;

public class EnderecoDaoTeste {
	
	public static void main(String[] args) {
		
		//Obter o entity manager
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		//Instanciar um EnderecoDao
		EnderecoDao dao = new EnderecoDaoImpl(em);
		
		//Cadastrar um endereco
		Endereco end = new Endereco("123452", "Av. Paulista", 1222, true, TipoEndereco.APARTAMENTO);
		
		try {
			dao.create(end);
			dao.commit();
			System.out.println("Endereço registrado!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Pesquisar um endereco e exibir os dados
		try {
			end = dao.search(21);
			System.out.println(end);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Atualizar um endereço
		end = new Endereco(21, "2330012", "Rua Duque", 10, false, TipoEndereco.CASA);
		try {
			dao.update(end);
			dao.commit();
			System.out.println("Endereço atualizado");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Remover um endereço
//		try {
//			dao.delete(21);
//			dao.commit();
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		} catch (EnderecoNotFoundException e) {
//			System.out.println("Endereço nã existe para ser removido!");
//		}
		
		//Fechar
		em.close();
		fabrica.close();
		
		
		
	}//main
}//class
