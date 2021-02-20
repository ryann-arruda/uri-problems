package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int firstCode, firstQuantity, secondCode, secondQuantity;
		double firstUnitValue, secondUnitValue, total;
		
		firstCode = sc.nextInt();
		firstQuantity = sc.nextInt();
		firstUnitValue = sc.nextDouble();
		
		secondCode = sc.nextInt();
		secondQuantity = sc.nextInt();
		secondUnitValue = sc.nextDouble();
		
		total = (firstQuantity * firstUnitValue) + (secondQuantity * secondUnitValue);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		
		sc.close();
	}
}
