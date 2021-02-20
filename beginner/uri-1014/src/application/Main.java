package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int X;
		double Y, averageConsumption;
		
		X = sc.nextInt();
		Y = sc.nextDouble();
		
		averageConsumption = X/Y;
		
		System.out.printf("%.3f km/l%n", averageConsumption);
		
		sc.close();
	}
}
