package br.com.fiap.tds.main;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.dao.FuncionarioDao;
import br.com.fiap.tds.dao.FuncionarioOracleDao;

public class TesteInterface {
	public static void main(String[] args) {
	
		
		//Instanciar um objeto do tipo FuncionarioDao
		FuncionarioDao dao = new FuncionarioOracleDao();
		
		//Chamar o metodo de atualizar funcionario
		dao.atualizar(new Funcionario());
		
		
		
		
		
		
		
	}
}
