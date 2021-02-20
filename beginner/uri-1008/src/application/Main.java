package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int employeeNumber, hoursWorked;
		double hourlyValue, salary;
		
		employeeNumber = sc.nextInt();
		hoursWorked = sc.nextInt();
		hourlyValue = sc.nextDouble();
		
		salary = hoursWorked * hourlyValue;
		
		System.out.println("NUMBER = " + employeeNumber);
		System.out.printf("SALARY = U$ %.2f%n", salary);
		
		sc.close();
	}
}
