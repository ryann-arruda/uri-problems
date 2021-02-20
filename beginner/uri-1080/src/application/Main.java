package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int highestValue = Integer.MIN_VALUE;
		int position = 0;
		
		for(int i = 1; i <= 100; i++) {
			int aux = sc.nextInt();
			
			if(aux > highestValue) {
				highestValue = aux;
				position = i;
			}
		}
		
		System.out.println(highestValue);
		System.out.println(position);
		
		sc.close();
	}
}
