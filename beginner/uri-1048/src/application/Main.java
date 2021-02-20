package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salary, readjustmentValue;
		
		salary = sc.nextDouble();
		
		if(salary >= 0 && salary <= 400.00) {
			readjustmentValue = salary * 0.15;
			salary += readjustmentValue;
			
			System.out.printf("Novo salario: %.2f%n", salary);
			System.out.printf("Reajuste ganho: %.2f%n", readjustmentValue);
			System.out.println("Em percentual: 15 %");
		}
		
		else if(salary <= 800.00) {
			readjustmentValue = salary * 0.12;
			salary += readjustmentValue;
			
			System.out.printf("Novo salario: %.2f%n", salary);
			System.out.printf("Reajuste ganho: %.2f%n", readjustmentValue);
			System.out.println("Em percentual: 12 %");
		}
		
		else if(salary <= 1200.00) {
			readjustmentValue = salary * 0.10;
			salary += readjustmentValue;
			
			System.out.printf("Novo salario: %.2f%n", salary);
			System.out.printf("Reajuste ganho: %.2f%n", readjustmentValue);
			System.out.println("Em percentual: 10 %");
		}
		
		else if(salary <= 2000.00) {
			readjustmentValue = salary * 0.07;
			salary += readjustmentValue;
			
			System.out.printf("Novo salario: %.2f%n", salary);
			System.out.printf("Reajuste ganho: %.2f%n", readjustmentValue);
			System.out.println("Em percentual: 7 %");
		}
		
		else {
			readjustmentValue = salary * 0.04;
			salary += readjustmentValue;
			
			System.out.printf("Novo salario: %.2f%n", salary);
			System.out.printf("Reajuste ganho: %.2f%n", readjustmentValue);
			System.out.println("Em percentual: 4 %");
		}
		
		sc.close();
	}
}
