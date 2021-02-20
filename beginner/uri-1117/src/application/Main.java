package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double total = 0.0, average;
		int count = 0;
		
		while(count < 2) {
			double aux = sc.nextDouble();
			
			if(aux >= 0.0 && aux <= 10.0) {
				total += aux;
				count++;
			}
			
			else {
				System.out.println("nota invalida");
			}
		}
		
		average = total/count;
		
		System.out.printf("media = %.2f%n", average);
		
		sc.close();
	}
}
