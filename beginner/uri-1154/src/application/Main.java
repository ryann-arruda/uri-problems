package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double average = 0.0;
		int age = 0, count = 0;
		
		do {
			average += age;
			
			age = sc.nextInt();
			
			if(age > 0) {
				count++;
			}
			
		} while(age > 0);
		
		average /= count;
		
		System.out.printf("%.2f%n", average);
		
		sc.close();
	}
}
