package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double firstValue, secondValue, thirdValue;
		double delta;
		
		firstValue = sc.nextDouble();
		secondValue = sc.nextDouble();
		thirdValue = sc.nextDouble();
		
		if(firstValue == 0) {
			System.out.println("Impossivel calcular");
		}
		
		else {
			delta = Math.pow(secondValue, 2) - 4 * firstValue * thirdValue;
			
			if(delta < 0) {
				System.out.println("Impossivel calcular");
			}
			
			else {
				double firstRoot = ((-secondValue) + Math.sqrt(delta))/(2 * firstValue);
				double secondRoot = ((-secondValue) - Math.sqrt(delta))/(2 * firstValue);
				
				System.out.printf("R1 = %.5f%n", firstRoot);
				System.out.printf("R2 = %.5f%n", secondRoot);
			}
		}
		
		sc.close();
	}
}