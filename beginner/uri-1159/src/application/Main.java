package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X, sum = 0;
		
		do {
			X = sc.nextInt();
			
			for(int i = X, k = 0; k < 5 && X != 0; i++) {
				
				if(i % 2 == 0) {
					k++;
					sum += i;
					
					if(k == 5) {
						System.out.println(sum);
					}
				}
			}
			
			sum = 0;
			
		} while (X != 0);
		
		sc.close();
	}
}
