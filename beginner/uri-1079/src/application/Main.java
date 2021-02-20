package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		
		for(int i = 0; i < cases; i++) {
			double[] values = new double[3];
			double average;
			
			for(int j = 0; j < 3; j++) {
				values[j] = sc.nextDouble();
			}
			
			average = ((values[0] * 2.0) + (values[1] * 3.0) + (values[2] * 5.0))/10.0;
			
			System.out.printf("%.1f%n", average);
		}
		
		sc.close();
	}
}
