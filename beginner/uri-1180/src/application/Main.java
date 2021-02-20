package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lowestValue = Integer.MAX_VALUE;
		int position = -1;
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int aux = sc.nextInt();
			
			if(aux < lowestValue) {
				lowestValue = aux;
				position = i;
			}
		}
		
		System.out.println("Menor valor: " + lowestValue);
		System.out.println("Posicao: " + position);
		
		sc.close();
	}
}
