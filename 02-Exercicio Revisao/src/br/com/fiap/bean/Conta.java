package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoNegativoException;

public abstract class Conta {
	
	private int agencia;
	private int numero;
	protected double saldo;
	private Calendar dataAbertura;
	
	//Construtores
	public Conta() {
	}

	public Conta(int agencia, int numero, double saldo, Calendar dataAbertura) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
	}
	
	//Metodos
	
	public abstract void retirar(double valor) throws SaldoNegativoException;
	public void depositar(double valor) {
		saldo += valor;
	}
	
	
	//Ctrl + 3 = gera get e sets
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Calendar getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Calendar dataAbertura) {
		this.dataAbertura = dataAbertura;
	}
	
	
	

}
