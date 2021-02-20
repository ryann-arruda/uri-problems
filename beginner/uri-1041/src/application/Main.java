package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double firstValue, secondValue;
		
		firstValue = sc.nextDouble();
		secondValue = sc.nextDouble();
		
		if(firstValue > 0 && secondValue > 0) {
			System.out.println("Q1");
		}
		
		else if(firstValue < 0 && secondValue > 0) {
			System.out.println("Q2");
		}
		
		else if(firstValue < 0 && secondValue < 0) {
			System.out.println("Q3");
		}
		
		else if(firstValue > 0 && secondValue < 0) {
			System.out.println("Q4");
		}
		
		else if(firstValue == 0 && secondValue == 0) {
			System.out.println("Origem");
		}
		
		else if(firstValue != 0 && secondValue == 0) {
			System.out.println("Eixo X");
		}
		
		else {
			System.out.println("Eixo Y");
		}
		
		sc.close();
	}
}
