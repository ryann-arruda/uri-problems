package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		do {
			
			N = sc.nextInt();
			
			if(N != 0){
    			int[][] M = new int[N][N];
    			
    			matrixFill(M, N);
    			matrixPrinting(M, N);
		    }   

		} while (N != 0);
		
		sc.close();
	}
	
	public static void matrixFill(int[][] M, int N) {
		
		for(int k = 0; k < N; k++) {
			
			for(int i = 0, j = 0 + k; i < N && j < N; i++, j++) {
				M[i][j] = k + 1;
			}
			
			for(int i = 1 + k, j = 0; i < N && j < N; i++, j++) {
				M[i][j] = k + 2;
			}
		}
	}
	
	public static void matrixPrinting(int[][] M, int N) {
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < N; j++) {
				
                if(j < N - 1){
                    System.out.print(String.format("%3d ", M[i][j]));
                }
                
                else{
                    System.out.print(String.format("%3d", M[i][j]));
                }
			}
			
			System.out.println();
			
		}
		
		System.out.println();
	}
}
