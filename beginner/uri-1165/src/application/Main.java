package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int count = 0;
			int X = sc.nextInt();
			
			for(int j = 1; j <= X; j++) {
				
				if(X % j == 0) {
					count++;
				}
			}
			
			if(count == 2) {
				System.out.println(X + " eh primo");
			}
			
			else {
				System.out.println(X + " nao eh primo");
			}
		}
		
		sc.close();
	}
}
