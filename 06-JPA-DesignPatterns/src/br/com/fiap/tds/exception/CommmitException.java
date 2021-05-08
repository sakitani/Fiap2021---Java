package br.com.fiap.tds.exception;

public class CommmitException extends Exception {
	
	public CommmitException() {
		super("Erro ao realizar o commit");
	}
	
	public CommmitException(String msg) {
		super(msg);
	}

}
