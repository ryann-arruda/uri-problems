package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		while(sc.hasNext()){
			
			int dimension = sc.nextInt();
			int[][] M = new int[dimension][dimension];
			
			fillMatrix(M, dimension);
			printMatrix(M, dimension);
		} 
		
		sc.close();
	}
	
	public static void fillMatrix(int[][] M, int dimension) {
		int referenceNumber = dimension/2;
		
		// Fills the central cell of the matrix
		if(dimension % 2 != 0) {
			M[referenceNumber][referenceNumber] = 2;
		}
		
		// Above
		for(int i = 0; i < referenceNumber; i++) {
			for(int j = 0 + i; j < dimension - i; j++) {
				
				if(j == 0 + i) {
					M[i][j] = 1;
				}
				
				else if(j == (dimension - i) - 1) {
					M[i][j] = 2;
				}
				
				else {
					M[i][j] = 3;
				}
			}
		}
		
		// On the right
		for(int j = dimension - 1, k = 0; k < referenceNumber; k++, j--) {
			for(int i = 1 + k; i < dimension - k; i++) {
				
				if(j == (dimension - k) - 2) {
					M[i][j] = 2;
				}
				
				else if(i == (dimension - k) - 1) {
					M[i][j] = 1;
				}
				
				else {
					M[i][j] = 3;
				}
			}
		}
		
		// Below
		for(int i = dimension - 1, k = 0; k < referenceNumber; k++, i--) {
			for(int j = (dimension - 2) - k; j >= 0 + k; j--) {
				
				if(j == 0 + k) {
					M[i][j] = 2;
				}
				
				else {
					M[i][j] = 3;
				}
			}
		}
		
		// On the left
		for(int j = 0; j < referenceNumber; j++) {
			for(int i = 1 + j; i < (dimension - 1) - j; i++) {
				M[i][j] = 3;
			}
		}
	}
	
	public static void printMatrix(int[][] M, int dimension) {
		
		for(int i = 0; i < dimension; i++) {
			for(int j = 0; j < dimension; j++) {
				
				// Printing the last line numbers (j == dimension - 1)
				if(j == dimension - 1) {
					System.out.println(String.format("%d", M[i][j]));
				}
				
				else {
					System.out.print(String.format("%d", M[i][j]));
				}
			}
		}
	}
}
