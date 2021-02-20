package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salary = 0.0, total = 0.0;
		
		salary = sc.nextDouble();
		
		if(salary > 4500.00) {			
			total += (salary - 4500) * 0.28;
			salary -= (salary - 4500);
		}
		
		if(salary > 3000.00 && salary <= 4500.00) {			
			total += (salary - 3000.00) * 0.18;
			salary -= (salary - 3000.00);
		}
		
		if(salary > 2000.00 && salary <= 3000.00) {			
			total += (salary - 2000.00) * 0.08; 
			salary = 0.0;
		}
		
		if(salary > 0 && salary <= 2000.00) {
			System.out.println("Isento");
		}
		
		else {
			System.out.println("R$ " + String.format("%.2f", total));
		}
		
		sc.close();
	}
}
