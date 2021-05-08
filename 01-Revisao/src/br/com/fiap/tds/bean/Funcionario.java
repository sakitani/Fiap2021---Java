package br.com.fiap.tds.bean;

public class Funcionario extends Pessoa {
	
	//Construtor � herdado do pai? N�o
	
	public Funcionario(String nome, int idade) {
		super(nome, idade);
	}
	
	public Funcionario() {}
	
	@Override
	public String toString() {
		return getNome() + " -- " + getIdade();
	}
	
	//Subrescrita
	public void cadastrar() {
		System.out.println("Cadastrar um funcionario");
	}
	

}
