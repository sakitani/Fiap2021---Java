package br.com.fiap.tds.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fiap.tds.bean.Funcionario;



public class TesteColecao {
	public static void main(String[] args) {
		
		//Criar uma lista de funcionario
		List<Funcionario> l = new ArrayList<>();
		
		//Adicionar dois funcionarios
		l.add(new Funcionario("Cleiton", 20));
		Funcionario func = new Funcionario("Lucas", 19);
		l.add(func);
		
		//Exibir os funcionario da lista
		for (int i = 0; i < l.size(); i ++) {
			System.out.println(l);
		}
		
		//For each
		for(Funcionario f: l) {
			System.out.println(f.getNome() + " " + f.getIdade());
		}
		
//		---------------------------------------------------
		
		//Mapa
		Map<String, Funcionario> mapa = new HashMap<String, Funcionario>();
				
		//Adicionar dois funcionarios no mapa
		mapa.put("f1", new Funcionario("Vini", 30));
		mapa.put("f2", new Funcionario("Julia", 40));
		
		//Recuperar o funcionario pela chave
		func = mapa.get("f2");
		System.out.println(func.getNome() + " " + func.getIdade());
				
				
				
	}//main
}//class
