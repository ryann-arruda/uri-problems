package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		int firstValue = sc.nextInt();
		int secondValue = sc.nextInt();
		
		if(firstValue > secondValue) {
			
			for(int i = secondValue; i <= firstValue; i++) {
				
				if(i % 13 != 0) {
					sum += i;
				}
			}
		}
		
		else {
			for(int i = firstValue; i <= secondValue; i++) {
				
				if(i % 13 != 0) {
					sum += i;
				}
			}
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
