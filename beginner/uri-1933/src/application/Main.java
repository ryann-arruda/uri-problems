package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if(A == B) {
			System.out.println(B);
		}
		
		else {
			if(A > B) {
				System.out.println(A);
			}
			
			else {
				System.out.println(B);
			}
		}
		
		sc.close();
	}
}