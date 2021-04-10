package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = 0;
		
		do {
			N = sc.nextInt();
			int[][] M = new int[N][N];
			
			if(N != 0) {				
				fillMatrix(M, N);
				printMatrix(M, N);
			}
			
		}while(N != 0);
		
		sc.close();
	}
	
	public static void fillMatrix(int[][] M, int N) {
		int referenceNumber = N/2;
		
		// Correcting "referenceNumber" for odd numbers
		if(N % 2 != 0) {
			referenceNumber++;
		}
		
		// Above
		for(int i = 0; i < referenceNumber; i++) {
			for(int j = 0 + i; j < N - i; j++) {
				M[i][j] = i + 1;
			}
		}
		
		// On the right
		for(int j = N - 1, k = 0; k < referenceNumber; k++, j--) {
			for(int i = 1 + k; i < N - k; i++) {
				M[i][j] = k + 1;
			}
		}
		
		// Below
		for(int i = N - 1, k = 0; k < referenceNumber; k++, i--) {
			for(int j = 1 + k; j < N - (k + 1); j++) {
				M[i][j] = k + 1;
			}
		}
		
		// On the left
		for(int j = 0; j < referenceNumber; j++) {
			for(int i = 1 + j; i < N - j; i++) {
				M[i][j] = j + 1;
			}
		}
	}
	
	public static void printMatrix(int[][] M, int N) {
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < N; j++) {
				
				if(N == 1) {
					System.out.println("  " + M[i][j]);
				}
				
				else if(j == 0) {
					System.out.print("  " + M[i][j] + "   ");						
				}
				
				else if (j > 0 && j < N - 1) {
					
					// If the number has 2 decimal places it will be 2 spaces
					if(M[i][j + 1] >= 10) {
						System.out.print(M[i][j] + "  ");
					}
					
					else {
						System.out.print(M[i][j] + "   ");
					}
				}
				
				else {
					System.out.println(M[i][j]);
				}
			}
		}
		
		System.out.println();
	}
}
