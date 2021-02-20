package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int value = sc.nextInt();
		
		System.out.println(factorial(value));
		
		sc.close();
	}
	
	public static int factorial(int value) {
		
		if(value == 1 || value == 0) {
			return 1;
		}
		
		return value * factorial(value - 1);
	}
}
