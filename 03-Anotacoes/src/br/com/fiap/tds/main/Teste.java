package br.com.fiap.tds.main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import br.com.fiap.tds.annotation.Coluna;
import br.com.fiap.tds.bean.Carro;

public class Teste {
	public static void main(String[] args) {
		//Pode ser Object
		//Object carro = new Carro();
		Carro carro = new Carro();
		
		//API de reflection -> obter a estrutura da classe
		//Obter o nome da classe - consegue por vir de object
		String nome = carro.getClass().getName();
		System.out.println(nome);
		//Obter os metodos da classe - DeclareMEthods - declarado na class getMethods pega do pai tb
		System.out.println("\n Métodos");
		Method[] metodos = carro.getClass().getDeclaredMethods();
		for (Method m : metodos) {
		System.out.println(m.getName());
		}
		
		System.out.println("\n Atributos \n");
		Field[] atributos = carro.getClass().getDeclaredFields();
		for (Field a : atributos) {
		System.out.println(a.getName() + " " + a.getType());
		//Obter a anotação @Coluna
		Coluna c = a.getAnnotation(Coluna.class);
		System.out.println(c.nome() + " Tipo: " + c.tipo() + " Tamanho: "
		+ c.tamanho() + " PK: " + c.pk() + "\n");
		}
	}

}
