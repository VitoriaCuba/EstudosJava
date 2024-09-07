package oneDay;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Scanner idadeScanner = new Scanner (System.in) ;
	    //System.out.println("Digite a sua idade: ");
		//byte idadeCliente = idadeScanner.nextByte();
		//System.out.println(idadeCliente);
		
		
		Scanner numero1Scanner = new Scanner (System.in) ;
		System.out.print("Digite o primeiro valor: ");
		double numero1 = numero1Scanner.nextDouble();
		
		
		Scanner numero2Scanner = new Scanner (System.in) ;
		System.out.print("Digite o Segundo  valor: ");
		double numero2 = numero1Scanner.nextDouble();
		
		double resultado = numero1 + numero2 ;
		System.out.println("O resultado é:" + resultado);
		
	}
}
