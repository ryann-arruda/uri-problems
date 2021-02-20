package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		
		for(int i = 0; i < cases; i++) {
			int firstValue = sc.nextInt();
			int secondValue = sc.nextInt();
			
			if(secondValue == 0) {
				System.out.println("divisao impossivel");
			}
			
			else {
				double result = (double)firstValue / secondValue;
				
				System.out.printf("%.1f%n", result);
			}
		}
		
		sc.close();
	}
}
