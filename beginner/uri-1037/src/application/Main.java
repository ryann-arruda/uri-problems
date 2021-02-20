package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double value;
		
		value = sc.nextDouble();
		
		if(value >= 0 && value <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		
		else if(value > 25 && value <= 50) {
			System.out.println("Intervalo (25,50]");
		}
		
		else if(value > 50 && value <= 75) {
			System.out.println("Intervalo (50,75]");
		}
		
		else if(value > 75 && value <= 100) {
			System.out.println("Intervalo (75,100]");
		}
		
		else {
			System.out.println("Fora de intervalo");
		}
		
		sc.close();
	}
}