package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		final int SPENT_KILOMETER = 12;
		
		int time, averageVelocity;
		double liters;
		
		time = sc.nextInt();
		averageVelocity = sc.nextInt();
		
		liters = (double)(time * averageVelocity)/SPENT_KILOMETER;
		
		System.out.printf("%.3f%n", liters);
		
		sc.close();
	}
}
