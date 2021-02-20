package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] N = new int[1000];
		
		int T = sc.nextInt();
		
		for(int i = 0, k = 0; i < 1000; i++, k++) {
			
			if(k == T) {
				k = 0;
			}
			
			N[i] = k;
		}
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("N[" + i + "] = " + N[i]);
		}
		
		sc.close();
	}
}
