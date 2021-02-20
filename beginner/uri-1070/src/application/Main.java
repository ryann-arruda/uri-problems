package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int number = sc.nextInt();
		
		while(count < 6) {
			
			if(number % 2 != 0) {
				count++;
				System.out.println(number);
			}
			
			number++;
		}
		
		sc.close();
	}
}
