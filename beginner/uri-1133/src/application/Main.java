package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstValue = sc.nextInt();
		int secondValue = sc.nextInt();
		
		if(firstValue > secondValue) {
			
			for(int i = secondValue + 1; i < firstValue; i++) {
				
				if((i % 5 == 2) || (i % 5 == 3)) {
					System.out.println(i);
				}
			}
		}
		
		else {
			
			for(int i = firstValue + 1; i < secondValue; i++) {
				
				if((i % 5 == 2) || (i % 5 == 3)) {
					System.out.println(i);
				}
			}
		}
		
		sc.close();
	}
}
