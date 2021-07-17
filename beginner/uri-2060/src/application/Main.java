package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] multiples = new int[4];
		int N;
		
		N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int L = sc.nextInt();
			
			for(int j = 2; j <= 5; j++) {
				if(L % j == 0) {
					multiples[j - 2]++;
				}
			}
		}
		
		for(int i = 0; i < 4; i++) {
			System.out.println(multiples[i] + " Multiplo(s) de " + (i + 2));
		}
		
		sc.close();
	}
}
