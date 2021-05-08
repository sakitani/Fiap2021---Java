package br.com.fiap.tds.dao.exception;

public class EnderecoNotFoundException extends Exception {
	public EnderecoNotFoundException() {
		super("Endereço não encontrado");
	}
	
	public EnderecoNotFoundException(String msg) {
		super(msg);
	}
}
