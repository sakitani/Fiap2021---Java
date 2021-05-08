package br.com.fiap.tds.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



//Definir o lugar a anotação pode ser utilizada
//FIELD -> atributo
@Target({ElementType.FIELD, ElementType.METHOD})

//Teste.java - compilar -> Teste.class(bytecode) -> Interpretar JVM "Executar"
//Define até qdo a anotação estará presente
// SOUCE -> até o código(.java)
//CLASS -> até o bytecode(.class) (Qdo não declarado vai até class q é o default d @Retention)
//RUNTIME -> até o final
@Retention(RetentionPolicy.RUNTIME)

public @interface Coluna {
	String nome();
	String tipo();
	boolean pk() default false;
	int tamanho() default 255;
	//Qdo se passa valor como defalt ele não é obrigatorio ser instanciado no @Coluna 
	//pq ele já sabe o valor  - esse ex é dizer qual vai ser a PK 
}

