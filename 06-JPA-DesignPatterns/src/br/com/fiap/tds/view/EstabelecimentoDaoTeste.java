package br.com.fiap.tds.view;

import javax.persistence.EntityManager;

import br.com.fiap.tds.dao.EstabelecimentoDao;
import br.com.fiap.tds.dao.impl.EstabelecimentoDaoImpl;
import br.com.fiap.tds.entity.Estabelecimento;
import br.com.fiap.tds.entity.Tipo;
import br.com.fiap.tds.entity.tipoEstabelecimento;
import br.com.fiap.tds.exception.CommitException;
import br.com.fiap.tds.exception.EntityNotFoundException;
import br.com.fiap.tds.singleton.EntityManagerFactorySingleton;

public class EstabelecimentoDaoTeste {
	
	public static void main(String[] args) {
		
	
	//Obter um entity maneger
	EntityManager em = EntityManagerFactorySingleton.getInstance().createEntityManager();
	//Obter um dao do estabelecimento
	EstabelecimentoDao dao = new EstabelecimentoDaoImpl(em);
	
	//Instanciar um estabelecimento e cadastrar
	Estabelecimento est = new Estabelecimento("FIAP", "23.124.754/0001-98", Tipo.MATRIZ);
	try {
		dao.create(est);
		dao.commit();
		System.out.println("Estabelecimento cadastrado!");
	} catch (CommitException e) {
		System.out.println(e.getMessage());
	}
	
	//Pesquisar pelo codigo e exibir os dados
	try {
		est = dao.search(1);
		System.out.println(est.getNome() + " " + est.getCnpj());
	} catch (EntityNotFoundException e) {
		System.out.println("Estabelecimento não encontrado");
	}
	
	//Atualizar
	est = new Estabelecimento(2, "Plusift", "12.354.987/0001-01", Tipo.FILIAL);
	try {
		dao.update(est);
		dao.commit();
		System.out.println("Estabelecimento atualizado!");
	} catch (CommitException e) {
		System.out.println(e.getMessage());
	}
	
	//Remover
	try {
		dao.delete(2);
		dao.commit();
		System.out.println("Estabelecimento removido!");
	} catch (CommitException | EntityNotFoundException e) {
		System.out.println(e.getMessage());
	}
	
	//Fechar
	em.close();
	EntityManagerFactorySingleton.getInstance().close();

	}
}
