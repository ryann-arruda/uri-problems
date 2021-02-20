package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] values = new double[3];
		double A,B,C;
		
		// Input of values
		for(int i = 0; i < 3; i++) {
			values[i] = sc.nextDouble();
		}
		
		// Ordering of values
		for(int i = 0; i < values.length - 1; i++) {
			
			for(int j = i + 1; j < values.length; j++) {
				
				if(values[j] > values[i]) {
					double aux = values[i];
					values[i] = values[j];
					values[j] = aux;
				}
			}
		}
		
		// Assigning values
		A = values[0];
		B = values[1];
		C = values[2];
		
		// Classification
		if(A >= B + C) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		
		else {
		
			if(Math.pow(A, 2) == Math.pow(B, 2) + Math.pow(C, 2)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			
			if(Math.pow(A, 2) > Math.pow(B, 2) + Math.pow(C, 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			
			if(Math.pow(A, 2) < Math.pow(B, 2) + Math.pow(C, 2)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			
			if(A == B && A == C && B == C) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			
			if(A == B && A != C|| A == C && A != B|| B == C && B != A) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}
		
		sc.close();
	}
}
