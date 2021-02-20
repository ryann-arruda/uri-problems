package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int amountAlcohol = 0, amountGasoline = 0, amountDiesel = 0;
		int input;
		
		do {
			input = sc.nextInt();
			
			switch(input) {
				case 1:
					amountAlcohol++;
					break;
				
				case 2:
					amountGasoline++;
					break;
					
				case 3:
					amountDiesel++;
					break;
			}
			
		} while(input != 4);
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + amountAlcohol);
		System.out.println("Gasolina: " + amountGasoline);
		System.out.println("Diesel: " + amountDiesel);
		
		sc.close();
	}
}
