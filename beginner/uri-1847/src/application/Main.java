package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		if(B < A) {
			if(C >= B) {
				System.out.println(":)");
			}
			
			else if(C < B) {
				if((B - C) < (A - B)) {
					System.out.println(":)");
				}
				
				else if((B - C) >= (A - B)) {
					System.out.println(":(");
				}
			}
		}
		
		else if(B > A) {
			if(C <= B) {
				System.out.println(":(");
			}
			
			else if(C > B) {
				if((C - B) < (B - A)) {
					System.out.println(":(");
				}
				
				else if((C - B) >= (B - A)) {
					System.out.println(":)");
				}
			}
		}
		
		else if(A == B) {
			if(C > B) {
				System.out.println(":)");
			}
			
			else {
				System.out.println(":(");
			}
		}
		
		sc.close();
	}
}
