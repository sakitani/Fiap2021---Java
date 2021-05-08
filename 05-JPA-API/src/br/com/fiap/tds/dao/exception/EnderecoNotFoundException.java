package br.com.fiap.tds.dao.exception;

public class EnderecoNotFoundException extends Exception {
	public EnderecoNotFoundException() {
		super("Endere�o n�o encontrado");
	}
	
	public EnderecoNotFoundException(String msg) {
		super(msg);
	}
}
