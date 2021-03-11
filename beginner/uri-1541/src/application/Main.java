package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B;
		double C;
		
		do {
			A = sc.nextInt();
			
			if(A != 0) {
				B = sc.nextInt();
				C = sc.nextDouble();
				
				int terrainSide = (int) Math.sqrt((A * B)/(C / 100));
				
				System.out.println(terrainSide);
			}
			
		} while(A != 0);
		
		sc.close();
	}
}