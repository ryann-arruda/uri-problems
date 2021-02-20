package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int totalGuineaPigs;
		int amountMice = 0, amountFrogs = 0, amountRabbits = 0;
		double percentageRats, percentageFrogs, percentageRabbits;
		
		int cases = sc.nextInt();
		sc.nextLine();
		
		for(int i = 0; i < cases; i++) {
			String[] aux = new String[2];
			
			aux = sc.nextLine().split(" ");
			
			if(aux[1].equals("R")) {
				amountMice += Integer.parseInt(aux[0]);
			}
			
			else if(aux[1].equals("S")) {
				amountFrogs += Integer.parseInt(aux[0]);
			}
			
			else {
				amountRabbits += Integer.parseInt(aux[0]);
			}
		}
		
		totalGuineaPigs = amountMice + amountFrogs + amountRabbits;
		
		percentageRats = (amountMice * 100.00)/ totalGuineaPigs;
		percentageFrogs = (amountFrogs * 100.00)/ totalGuineaPigs;
		percentageRabbits = (amountRabbits * 100.00)/ totalGuineaPigs;
		
		System.out.println("Total: " + totalGuineaPigs + " cobaias");
		System.out.println("Total de coelhos: " + amountRabbits);
		System.out.println("Total de ratos: " + amountMice);
		System.out.println("Total de sapos: " + amountFrogs);
		System.out.println("Percentual de coelhos: " + String.format("%.2f", percentageRabbits) + " %");
		System.out.println("Percentual de ratos: " + String.format("%.2f", percentageRats) + " %");
		System.out.println("Percentual de sapos: " + String.format("%.2f", percentageFrogs) + " %");
		
		sc.close();
	}
}
