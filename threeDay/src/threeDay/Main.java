package threeDay;

import java.text.NumberFormat;

public class Main {

	public static void main(String[] args) {
		
		// Estudando conversão de moedas
		NumberFormat pound = NumberFormat.getCurrencyInstance();
		String productValue = pound.format(120.80);
		
		System.out.println(productValue);
		
		//Estudando comparação
		
		int a = 4;
		int b = 5;
		
		System.out.println(a != b);
		
		// if e else
		
		int valorCarro = 100_001;
		
		if (valorCarro > 100_000)
		   System.out.println("Não comprar acima da tabela");
		   
		    else if (valorCarro >= 90_000 && valorCarro <= 100_000)
			   
			   System.out.println("Comprar");
			   else 
				   System.out.println("Não comprar");
		
		// Operador ternário
		
		int ingresso = 800;
		
		String terAcesso = ingresso >=500 ? "VIP" : "Pista" ; // operador ternário
		
		
		if(ingresso >=500)
			terAcesso = "VIP";
		else
			terAcesso = "Pista";
		
		System.out.println(terAcesso);
		
		//
		
		

	}

}
