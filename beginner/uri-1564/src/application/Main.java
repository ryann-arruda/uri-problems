package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		do {
			N = sc.nextInt();
			
			if(N == 0) {
				System.out.println("vai ter copa!");
			}
			
			else {
				System.out.println("vai ter duas!");
			}
			
		} while(sc.hasNextInt());
		
		sc.close();
	}
}