package br.com.fiap.tds.main;

public class Teste {
	
	public static void main(String[] args) {
		
		
		boolean ts = false;
		int var1 = 1;
		int var2 = 2;
		
		
        for(int i = 0; i < 3; ++i){
            
        	ts = !ts;
        	System.out.println("inicio " + ts );
        	
        	if(ts) {System.out.println(var1); } else {System.out.println(var2); }
        	if(ts) {System.out.println(var2); } else {System.out.println(var1); }
        	
        	System.out.println("fim " + ts );
        }
		
		
	}

}
