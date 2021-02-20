package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int code, quantity;
		
		code = sc.nextInt();
		quantity = sc.nextInt();
		
		switch(code) {
			case 1:
				System.out.printf("Total: R$ %.2f%n", quantity * 4.00);
				break;
			case 2:
				System.out.printf("Total: R$ %.2f%n", quantity * 4.50);
				break;
			case 3:
				System.out.printf("Total: R$ %.2f%n", quantity * 5.00);
				break;
			case 4:
				System.out.printf("Total: R$ %.2f%n", quantity * 2.00);
				break;
			case 5:
				System.out.printf("Total: R$ %.2f%n", quantity * 1.50);
				break;
			default:
				// Nothing to do
				break;
		}
		
		sc.close();
	}
}