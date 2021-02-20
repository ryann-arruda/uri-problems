package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[][] M = new double[12][12];
		
		int C = sc.nextInt();
		char T = sc.next().charAt(0);
		
		for(int i = 0; i < 12; i++) {
			
			for(int j = 0; j < 12; j++) {
				M[i][j] = sc.nextDouble();
			}
		}
		
		switch(T) {
			case 'S':
				double sum = 0.0;
				
				for(int i = 0; i < 12; i++) {
					sum += M[i][C];
				}
				
				System.out.printf("%.1f%n", sum);
				
				break;
			
			case 'M':
				double average = 0.0;
				
				for(int i = 0; i < 12; i++) {
					average += M[i][C];
				}
				
				average /= 12.0;
				
				System.out.printf("%.1f%n", average);
				
				break;
		}
		
		sc.close();
	}
}
