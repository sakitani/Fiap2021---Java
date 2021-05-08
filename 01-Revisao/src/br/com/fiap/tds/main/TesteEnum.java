package br.com.fiap.tds.main;

import br.com.fiap.tds.bean.Funcionario;
import br.com.fiap.tds.bean.Genero;

public class TesteEnum {
	
	public static void main(String[] args) {
		
		//Instanciar um funcionario
		Funcionario funcionario = new Funcionario("Guto", 19);
		
		//Atribuir um valor para genero do funcionario
		funcionario.setGenero(Genero.FEMININO);
		
		//Validar se o genero é feminino
		if(funcionario.getGenero().equals(Genero.FEMININO) ) {
			System.out.println("É uma colaboradora");
		}
		
		
		//Exibir o genero
		System.out.println(funcionario.getGenero());
		
		
	}
}
