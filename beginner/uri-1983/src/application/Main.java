package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, registration = 0;
		double grade = 0.0;
		
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int auxRegistration = sc.nextInt();
			double auxGrade = sc.nextDouble();
			
			if(auxGrade >= 8.0) {
				if(auxGrade > grade) {
					grade = auxGrade;
					registration = auxRegistration;
				}
			}
		}
		
		if(registration == 0) {
			System.out.println("Minimum note not reached");
		}
		
		else {
			System.out.println(registration);
		}
		
		sc.close();
	}
}