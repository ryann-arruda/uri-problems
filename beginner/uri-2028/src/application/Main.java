package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		for(int i = 1; sc.hasNextInt(); i++) {
			int sequenceSize;
			
			N = sc.nextInt();
			
			sequenceSize = sequenceSize(N);
			System.out.println("Caso " + i + ": " + sequenceSize + (sequenceSize == 1? " numero" : " numeros"));
			sequenceGenerator(N);
		}
		
		sc.close();	
	}
	
	public static void sequenceGenerator(int N) {
		
		for(int i = 0; i <= N; i++) {
			int condition;
			
			if(i == 0 || i == 1) {
				condition = 0;
			}
			
			else {
				condition = i - 1;
			}
			
			for(int j = 0; j <= condition; j++) {
				
				if(i == 0 && i == N || i == N && j == condition) {
					System.out.print(i);
				}
				
				else {
					System.out.print(i + " ");
				}
			}
		}
		
		System.out.printf("%n%n");
	}
	
	public static int sequenceSize(int N) {
		
		if(N == 0) {
			return 1;
		}
		
		return N + (sequenceSize(N - 1));
	}
}