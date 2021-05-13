package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N, answer = 0, value = Integer.MAX_VALUE;
		
		N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int aux = sc.nextInt();
			
			if(aux < value) {
				answer = i + 1;
				value = aux;
			}
		}
		
		System.out.println(answer);
		
		sc.close();
	}
}