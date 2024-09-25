package fourDay;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//COLETANDO O NOME DO PRODUTO
		System.out.print("Digite o nome da fruta: ");
		Scanner s = new Scanner (System.in);
		String nomeProduto = s.next().toLowerCase();
		// RETORNA O VALOR DO PRODUTO
		
		switch (nomeProduto) {
		case "Banana":
			System.out.println("R$8,40");
			break;
		case "Manga":
			System.out.println("R$12,90");
			break;	
		case "Maça":
			System.out.println("R$11,90");
			break;
		case "Limão":
			System.out.println("R$4,80");
				
		}
	}

}
