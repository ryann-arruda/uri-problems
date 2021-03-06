package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sum = 0.0, amountNumbers = 0.0;
		double[][] M = new double[12][12];
		
		char O = sc.next().charAt(0);
		
		// Input Values
		for(int i = 0; i < 12; i++) {
			
			for(int j = 0; j < 12; j++) {
				M[i][j] = sc.nextDouble();
			}
		}
		
		// Sum of Values
		for(int j = 11, k = 0; j > 6; j--, k++) {
			
			for(int i = 1 + k; i < 11 - k; i++) {
				sum += M[i][j];
				amountNumbers++;
			}
		}
		
		// Operation
		switch(O) {
			case 'S':
				System.out.println(String.format("%.1f", sum));
				break;
			
			case 'M':
				double average = sum/amountNumbers;
				
				System.out.println(String.format("%.1f", average));
				break;
		}
		
		sc.close();
	}
}
