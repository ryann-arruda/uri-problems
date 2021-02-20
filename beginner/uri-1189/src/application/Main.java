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
		
		// Input values
		for(int i = 0; i < 12; i++) {
			
			for(int j = 0; j < 12; j++) {
				M[i][j] = sc.nextDouble();
			}
		}
		
		// Sum of values
		for(int j = 0; j < 5; j++) {
			
			for(int i = 1 + j; i < 11 - j; i++) {
				sum += M[i][j];
				amountNumbers++;
			}
		}
		
		// Operation
		switch(O) {
			case 'S':
				System.out.printf("%.1f%n", sum);
				break;
				
			case 'M':
				double average = sum/amountNumbers;
				
				System.out.printf("%.1f%n", average);
				break;
		}
		
		
		sc.close();
	}
}
