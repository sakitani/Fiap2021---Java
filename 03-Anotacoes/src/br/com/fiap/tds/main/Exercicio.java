package br.com.fiap.tds.main;

import br.com.fiap.tds.bean.Aluno;
import br.com.fiap.tds.bean.Carro;
import br.com.fiap.tds.orm.Orm;

public class Exercicio {
	
	public static void main(String[] args) {
		//Instanciar um carro e aluno
		Carro carro = new Carro();
		Aluno aluno = new Aluno();
		
		//Instanciar um Orm
		Orm orm = new Orm();
		
		//Chamar o método paraPesquisa e exibir o resultado
		System.out.println(orm.gerarPesquisa(aluno));
		System.out.println(orm.gerarPesquisa(carro));
	}

}
