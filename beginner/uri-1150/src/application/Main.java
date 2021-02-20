package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		int X, Z;
		
		X = sc.nextInt();
		
		do {
			Z = sc.nextInt();
			
		} while(Z <= X);
		
		for(int i = X + 1, sum = X; sum <= Z; i++) {
			sum += i;
			count++;
		}
		
		System.out.println(count);
		
		sc.close();
	}
}
