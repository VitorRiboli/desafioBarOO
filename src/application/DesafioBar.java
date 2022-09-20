package application;

import java.util.Locale;
import java.util.Scanner;

public class DesafioBar {

	public static void main(String[] args) {
		//Sem OO
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Sexo: ");
		String sexo = sc.nextLine();	
		
		double ticket;
		
		while(!sexo.equals("M") && !sexo.equals("m") && !sexo.equals("F") && !sexo.equals("f")) {
			System.out.print("Sexo: ");
			sexo = sc.nextLine();
		}
		
		if(sexo.equals("M") || sexo.equals("m")) {
			ticket = 10.0;
		}
		else {
			ticket = 8.0;
		}
		
		System.out.print("Quantidade de cervejas: ");
		int beer = sc.nextInt();
		
		System.out.print("Quantidade de refrigerante: ");
		int soda = sc.nextInt();
		
		System.out.print("Quantidade de espetinhos: ");
		int skewer = sc.nextInt();
			
		double totalConsumption = (beer * 5.0 ) + (soda * 3.0) + (skewer * 7.0);
		
		double amountToPay = totalConsumption + ticket;
		
		System.out.println("RELATÓRIO:");
		System.out.println("Consumo: " + String.format("%.2f", totalConsumption));
		if(totalConsumption > 30) {
			System.out.println("Isento de Couvert");
		}
		else {
			System.out.println("Couvert: R$ 4.00 ");
			amountToPay += 4.0;
		}
		System.out.println("Ingresso: R$ " + String.format("%.2f", ticket));
		System.out.println();
		System.out.println("Valor a pagar: R$ " + String.format("%.2f", amountToPay));
		
		sc.close();
	}

}
