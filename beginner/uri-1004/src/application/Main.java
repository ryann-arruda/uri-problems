package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstValue, secondValue, PROD;
		
		firstValue = sc.nextInt();
		secondValue = sc.nextInt();
		
		PROD = firstValue * secondValue;
		
		System.out.println("PROD = " + PROD);
		
		sc.close();
	}
}
