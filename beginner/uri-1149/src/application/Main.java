package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, N, sum = 0;
		
		A = sc.nextInt();
		N = sc.nextInt();
		
		while(N < 0 || N == 0) {
			N = sc.nextInt();
		}
		
		for(int i = 0; i <= (N - 1); i++) {
			sum += (A + i);
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}
