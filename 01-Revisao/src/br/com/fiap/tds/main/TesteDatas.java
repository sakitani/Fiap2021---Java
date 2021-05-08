package br.com.fiap.tds.main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteDatas {
	public static void main(String[] args) {
		
		//Instanciar um objeto data com a data atual
		//Abstrato não pode instanciar 
		Calendar hoje = Calendar.getInstance(); //data de hoje
		
		Calendar challenge = new GregorianCalendar(2021, 5, 15);
		
		
		//Formatado de data
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		//Exibir a data
		System.out.println(formatador.format(hoje.getTime()));
		System.out.println(formatador.format(challenge.getTime()));
		
		
	}

}
