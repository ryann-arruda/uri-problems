package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] N = new int[20];
		
		for(int i = 0; i < 20; i++) {
			N[i] = sc.nextInt();
		}
		
		for(int i = 0, j = 19; i < 10; i++, j--) {
			int aux = N[i];
			
			N[i] = N[j];
			N[j] = aux;
		}
		
		for(int i = 0; i < 20; i++) {
			System.out.println("N[" + i + "] = " + N[i]);
		}
		
		sc.close();
	}
}
