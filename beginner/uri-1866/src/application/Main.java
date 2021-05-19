package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		
		for(int i = 0; i < C; i++) {
			int N,S = 0;
			
			N = sc.nextInt();
			
			for(int j = 0; j < N; j++) {
				
				if(j % 2 == 0) {
					S++;
				}
				
				else {
					S--;
				}
			}
			
			System.out.println(S);
		}
		
		sc.close();
	}
}