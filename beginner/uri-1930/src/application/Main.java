package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int sum = 0;
		int[] Ts = new int[4];
		
		for(int i = 0; i < 4; i++) {
			Ts[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 4; i++) {
			
			if(i != 3) {
				sum += Ts[i] - 1;
			}
			
			else {
				sum += Ts[i];
			}
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}