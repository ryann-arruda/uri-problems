package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long currentValue = 0, nextValue = 1; 
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int N = sc.nextInt();
			long[] fibonacci = new long[(N == 0 ? 1 : N + 1)];
			
			for(int j = 0; j <= N; j++) {
				if(currentValue == 0) {
					fibonacci[j] = currentValue;
					
					currentValue = nextValue;
					nextValue = 0;
				} 
				
				else {
					fibonacci[j] = currentValue;
					
					long aux = currentValue;
					
					currentValue = nextValue +  aux;
					nextValue = aux;
				}
			}
			
			currentValue = 0;
			nextValue = 1;
			
			System.out.println("Fib(" + N + ") = " + fibonacci[N]);
			
		}
		
		sc.close();
	}
}