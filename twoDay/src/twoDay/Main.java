package twoDay;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		//Criando listas, organizando e inserindo
		int [] valores = {10, 20, 15, 30, 40 };
		Arrays.sort(valores);
		System.out.println(Arrays.toString(valores));
		System.out.println(valores.length);
		
		String [] names = {"Vitoria","Vitor","Sonia","Maria"};
		names[2] = "Joao";
		
		System.out.println(Arrays.toString(names));
		System.out.println(names[2]);
		
		//Arrays Multidimensionais
		
		String [][] cars = {{"BMW","Tesla"},{"Gol","Jeep"}};
		System.out.println(Arrays.deepToString(cars));
		
		
		// Estudando constantes
		// final torna uma variavel constante e não modificavel 
		
		final double taxaJuros = 11.92;
		System.out.println(taxaJuros);
		
		
		// Estudando Operadores
		//fazer essa função em numeros quebrados permite sua impressão corretamente
		double b = (double)4 / (double)3;
		
		
		int a = 4 ;
		a++; // ++ permite que ocorra o incremento da +1 na variavel a mesma função se a adequa a -- 
		
		System.out.println(a);
		
		
		//Estuadando a ordem dos operadores
		
		int c = 4 + 2 * 3;
		System.out.println(c);
		
		//Estudando conversão de tipos
		
	}
}
