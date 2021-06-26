package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		System.out.println(increasePercentage(A,B));
		
		sc.close();
	}
	
	public static String increasePercentage(double originalValue, double newValue) {
		double result = 0.0;
		
		result = (newValue * 100.0)/originalValue;
		
		// Two % symbols were used to print 1 symbol
		return String.format("%.2f%%", (result - 100.00)); 
	}
}
