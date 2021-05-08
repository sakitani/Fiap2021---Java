package br.com.fiap.main;

import java.util.Calendar;
import java.util.GregorianCalendar;
import br.com.fiap.bean.ContaCorrente;
import br.com.fiap.bean.ContaPoupanca;
import br.com.fiap.bean.TipoConta;

public class Exercicio06 {
	public static void main(String[] args) {
		
	
	ContaCorrente cc = new ContaCorrente(1, 123, 100, Calendar.getInstance(), TipoConta.COMUM);
	
	ContaPoupanca cp = new ContaPoupanca(1, 123, 90, new GregorianCalendar(2020, Calendar.APRIL, 1), TipoConta.COMUM);
	
	//Chamar o método retirar
	// RuntimeException x Esception
	//Uma é tratada e a outra não
	
	
	try {
		cp.retirar(90);
		System.out.println("Saque foi realizado!");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}

	
	
	
	}//main
}//class
