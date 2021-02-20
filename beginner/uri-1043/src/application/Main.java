package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A,B,C;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		if((A + B > C) && (B + C > A) && (C + A > B)) {
			double perimeter = A + B + C;
			
			System.out.println("Perimetro = " + perimeter);
		}
		
		else {
			double area = ((A + B) * C)/2.0;
			
			System.out.printf("Area = %.1f%n", area);
		}
		
		sc.close();
	}
}
