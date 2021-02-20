package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int X = sc.nextInt();
			int Y = sc.nextInt();
			
			if(X > Y) {
				for(int j = Y + 1; j < X; j++) {
					
					if(j % 2 != 0) {
						sum += j;
					}
				}
			}
			
			else {
				for(int j = X + 1; j < Y; j++) {
					
					if(j % 2 != 0) {
						sum += j;
					}
				}
			}
			
			System.out.println(sum);
			sum = 0;
		}
		
		sc.close();
	}
}
