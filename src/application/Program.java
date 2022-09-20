package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Sexo: ");
		char sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cerveja: ");
		int beer = sc.nextInt();
		System.out.print("Quantidade de refrigerante: ");
		int drink = sc.nextInt();
		System.out.print("Quantidade de espetinho: ");
		int barbecue = sc.nextInt();
		
		Bill client = new Bill(sexo, beer, barbecue, drink);
		
		System.out.println();
		System.out.println("RELATÓRIO:");
		System.out.println(client);
		
		sc.close();
	}

}
