package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		
		for(int i = 0; i < cases; i++) {
			int N = sc.nextInt(); 
			
			if(N == 0) {
				System.out.println("NULL");
			}
			
			else if(N % 2 == 0) {
				
				if(N > 0) {
					System.out.println("EVEN POSITIVE");
				}
				
				else {
					System.out.println("EVEN NEGATIVE");
				}
			}
			
			else {
				
				if(N > 0) {
					System.out.println("ODD POSITIVE");
				}
				
				else {
					System.out.println("ODD NEGATIVE");
				}
			}
		}
		
		sc.close();
	}
}
