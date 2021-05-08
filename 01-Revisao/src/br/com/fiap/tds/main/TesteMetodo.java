package br.com.fiap.tds.main;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.bean.Pessoa;

public class TesteMetodo {
	
	public static void main(String[] args) {
		
	//Instanciar pesssoa
	Pessoa pessoa = new Pessoa();
	
	//Chamar metodo cadastrar
	pessoa.cadastrar();
	
	//instanciar funcionario
	Funcionario f = new Funcionario();
	
	//chamar o metodo cadastrar
	f.cadastrar();
	
	Pessoa p = new Funcionario();
	
	
	}
	

}
