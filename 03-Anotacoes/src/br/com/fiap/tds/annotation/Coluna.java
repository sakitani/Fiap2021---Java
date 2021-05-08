package br.com.fiap.tds.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



//Definir o lugar a anota��o pode ser utilizada
//FIELD -> atributo
@Target({ElementType.FIELD, ElementType.METHOD})

//Teste.java - compilar -> Teste.class(bytecode) -> Interpretar JVM "Executar"
//Define at� qdo a anota��o estar� presente
// SOUCE -> at� o c�digo(.java)
//CLASS -> at� o bytecode(.class) (Qdo n�o declarado vai at� class q � o default d @Retention)
//RUNTIME -> at� o final
@Retention(RetentionPolicy.RUNTIME)

public @interface Coluna {
	String nome();
	String tipo();
	boolean pk() default false;
	int tamanho() default 255;
	//Qdo se passa valor como defalt ele n�o � obrigatorio ser instanciado no @Coluna 
	//pq ele j� sabe o valor  - esse ex � dizer qual vai ser a PK 
}

