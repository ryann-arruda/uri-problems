package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int sum = 0;
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			for(int j = X, k = 0; k < Y; j++) {
				
				if(j % 2 != 0) {
					sum += j;
					 k++;
				}
			}
			
			System.out.println(sum);
		}
		
		sc.close();
	}
}
