package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matrix;
		int N;
		
		do {
			N = sc.nextInt();
			matrix = new int[N][N];
			
			fillMatrix(matrix, N);
			printMatrix(matrix, N);
			
		}while(sc.hasNextInt());
		
		sc.close();
	}
	
	public static void fillMatrix(int[][] matrix, int N) {
		int startOne = N/3, centralElement = N/2;
		int stopConditionLine = (N - 1) - startOne;
		int stopConditionColumn = centralElement + (centralElement - startOne) + 1;
		
		matrix[centralElement][centralElement] = 4;
		
		// Above
		for(int i = 0, j = 0, k = 1; i != startOne; i++, j++, k++) {
			matrix[i][j] = 2;
			matrix[i][(N - k)] = 3;
		}
		
		for(int i = startOne; i < centralElement; i++) {
			for(int j = startOne; j < stopConditionColumn; j++) {
				matrix[i][j] = 1;
			}
		}
		
		// Below
		for(int i = N - 1, j = 0, k = 1; i > stopConditionLine; i--, j++, k++) {
			matrix[i][j] = 3;
			matrix[i][N - k] = 2;
		}
		
		for(int i = stopConditionLine; i > centralElement; i--) {
			for(int j = startOne; j < stopConditionColumn; j++) {
				matrix[i][j] = 1;
			}
		}
		
		// In the middle
		for(int j = startOne; j < stopConditionColumn; j++) {
			
			if(j == centralElement) {
				continue;
			}
			
			matrix[centralElement][j] = 1;
		}
		
	}
	
	public static void printMatrix(int[][] matrix, int N) {
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				
				if(j == N - 1) {
					System.out.println(matrix[i][j]);
				}
				
				else {
					System.out.print(matrix[i][j]);
				}
			}
		}
		
		System.out.println();
	}
}
