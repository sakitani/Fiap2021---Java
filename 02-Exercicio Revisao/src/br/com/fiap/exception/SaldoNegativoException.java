package br.com.fiap.exception;

public class SaldoNegativoException extends Exception {
	
	public SaldoNegativoException() {
		super("Saldo Insuficiente");
	}
	
	public SaldoNegativoException(String msg) {
		super(msg);
	}
	
	public SaldoNegativoException(double saldo) {
		super("Saldo insuficiente, saque m�ximo: " + saldo);
	}
	
	public SaldoNegativoException(double saldo, float taxa) {
		super("Saldo insuficiente limite m�ximo: " + (saldo - taxa) + ", taxa de terirada: " + taxa);
	}
}
