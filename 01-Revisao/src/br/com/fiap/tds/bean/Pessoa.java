package br.com.fiap.tds.bean;

public class Pessoa {
	
	/**
	 * private - apenas a propria classe
	 * public - todos
	 * protected - todos do pacote e classes filhas (qdo usar herança)
	 * default - todos do pacote
	 */
	//Atributos
	private String nome;
	private int idade;
	private boolean PCD;
	private Genero genero; // Ctrl + 1
	
	
	//Construtores
	public Pessoa() {
	}
	
	public Pessoa(String nome, int idade, boolean pCD) {
		this.nome = nome;
		this.idade = idade;
		PCD = pCD;
	}

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}


	//Metodo - sobrecarga
	public void cadastrar() {
		System.out.println("cadastrando uma pessoa");
	}
	

	public void cadastrar(String nome) {
		System.out.println("cadastrando uma pessoa" + nome);
	}
	
	public void cadastrar(String nome, int idade) {
		System.out.println("cadastrando uma pessoa e idade");
	}
	
	public boolean isPCD() {
		return PCD;
	}
	
	public void setPCD(boolean pCD) {
		PCD = pCD;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	

}
