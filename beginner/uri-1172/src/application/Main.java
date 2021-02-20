package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vector = new int[10];
		
		for(int i = 0; i < 10; i++) {
			int input = sc.nextInt();
			
			if(input <= 0) {
				vector[i] = 1;
			}
			
			else {
				vector[i] = input;
			}
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.println("X[" + i + "] = " + vector[i]);
		}
		
		sc.close();
	}
}
