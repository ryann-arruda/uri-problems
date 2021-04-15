package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T, R1, R2;;
		
		T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			R1 = sc.nextInt();
			R2 = sc.nextInt();
			
			System.out.println(R1 + R2);
		}
		
		sc.close();
	}
}
