package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N;
		
		do {
			int T;
			
			N = sc.nextInt();
			
			if(N != 0){
    			int[][] M = new int[N][N];
    			
    			fillMatrix(M, N);
    			T = findT(M, N);
    			printMatrix(M, N, T);
		    }   

		} while (N != 0);
		
		sc.close();
	}
	
	public static void fillMatrix(int[][] M, int N) {
		
		for(int k = 0; k < N; k++) {
			for(int i = 0, j = k; i < N && j < N; i++, j++) {
				
				if(i == 0) {
					
					if(j == 0) {
						M[i][j] = 1;
					}
					
					else {
						M[i][j] = M[i][j - 1] * 2;
					}
				}
				
				else {
					M[i][j] = M[i - 1][j - 1] * 4;
				}
			}
			
			for(int i = 1 + k, j = k; i < N; i++) {
				
				if(j == k) {
					
					if(i == 1) {
						M[i][j] = 2;
					}
					
					else {
						M[i][j] = M[i - 1][j] * 2;
					}
				}
				
				else {
					M[i][j] = M[i + 1][j + 1] * 4;
				}
			}
		}
	}
	
	public static int findT(int[][] M, int N) {
		String tString;
		int highestNumber = -1; 
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(highestNumber < M[i][j]) {
					highestNumber = M[i][j];
				}
			}
		}
		
		tString = String.valueOf(highestNumber);
		return tString.length();
	}
	
	public static void printMatrix(int[][] M, int N, int T) {
		
		for(int i = 0; i < N; i++) {
			
			for(int j = 0; j < N; j++) {
				
                if(j < N - 1){
                    System.out.print(String.format("%" + T + "d ", M[i][j]));
                }
                
                else{
                    System.out.print(String.format("%" + T + "d", M[i][j]));
                }
			}
			
			System.out.println();
			
		}
		
		System.out.println();
	}
}