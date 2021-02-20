package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			int result = i * number;
			
			System.out.println(i + " x " + number + " = " + result);
		}
		
		sc.close();
	}
}
