package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoNegativoException;

public class ContaCorrente extends Conta {
	
	private TipoConta tipoConta; //ctrl + 1 get e set

	
	//Construtor
	public ContaCorrente(int agencia, int numero, double saldo, Calendar dataAbertura, TipoConta tipoConta) {
		super(agencia, numero, saldo, dataAbertura);
		this.tipoConta = tipoConta;
	}

	

	@Override
	public void retirar(double valor) throws SaldoNegativoException {
		if(tipoConta == tipoConta.COMUM && saldo - valor < 0) {
			throw new SaldoNegativoException(saldo);
		}
		saldo -= valor;
		
	}


//	@Override
//	public void depositar(double valor) {
//		saldo += valor;	
//	}


	public ContaCorrente(TipoConta tipoConta) {
		super();
		this.tipoConta = tipoConta;
	}


	public TipoConta getTipoConta() {
		return tipoConta;
	}


	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}
	

	

}
