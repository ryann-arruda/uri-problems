package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name;
		double salary, salesAmount;
		
		name = sc.next();
		salary = sc.nextDouble();
		salesAmount = sc.nextDouble();
		
		salary += (salesAmount * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f%n", salary);
		
		sc.close();
	}
}
