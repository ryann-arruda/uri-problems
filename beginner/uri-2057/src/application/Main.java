package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int S, T, F, arrivalTime;
		
		S = sc.nextInt();
		T = sc.nextInt();
		F = sc.nextInt();
		
		arrivalTime = S + T + F;
		
		if(S == 0) {
			arrivalTime += 24;
		}
		
		while(arrivalTime >= 24) {
			arrivalTime -= 24;
		}
		
		System.out.println(arrivalTime);
		
		sc.close();
	}
}
