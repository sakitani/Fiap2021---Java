package br.com.fiap.bean;

import java.util.Calendar;

import br.com.fiap.exception.SaldoNegativoException;

public class ContaPoupanca extends Conta implements ContaInvestimento{
	
	private TipoConta tipoConta;
	private float taxa;
	//Constante
	
	//final: 
	//variavel -> n�o permite alterar o valor de 0.04 p outro valor
	//metodo -> n�o permite modificar o comportamento do m�todo (n�o pode sobrescrever pela filha)
	//classe -> n�o permite heran�a

	//static: o elemento pertence a classe e n�o a instancia(objeto) 
	//muito especifico usar o estatico pois se � orientado a objeto deve ser preferivel objeto instanciar
	public static final float RENDIMENTO = 0.04f;
	
	//Construtor
	
	public ContaPoupanca() {}
	
	public ContaPoupanca(int agencia, int numero, double saldo, Calendar dataAbertura, TipoConta tipoConta) {
		super(agencia, numero, saldo, dataAbertura);
		this.setTipoConta(tipoConta);
	}

	//Metodos
	

	@Override
	public void retirar(double valor) throws SaldoNegativoException {
		//validar se � poss�vel realizar saque
		if(saldo < valor + taxa) {
			throw new SaldoNegativoException(saldo, taxa);		
		}
		saldo -= valor + taxa;
		
	}

//	@Override
//	public void depositar(double valor) {
//		saldo += valor;	
//	}




	@Override
	public double calculaRetornoInvestimento() {
		return saldo * RENDIMENTO;
		
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}
	
	public float getTaxa() {
		return taxa;
	}

	public void setTaxa(float taxa) {
		this.taxa = taxa;
	}
}
