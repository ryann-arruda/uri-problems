package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long[] numberOfStars;
		int N;
		long totalSheep = 0L;
		
		N = sc.nextInt();		
		numberOfStars = new long[N]; 
		
		for(int i = 0; i < N; i++) {
			int X = sc.nextInt();
			
			numberOfStars[i] = X;
			totalSheep += X; 
		}
		
		int numberHouses = 0, index = 0;
		boolean sum = true;
		
		while(index > -1 && index < numberOfStars.length) {
			
			if(numberOfStars[index] != 0) {
				totalSheep--;
			}
			
			if(sum) {
				numberHouses++;
			}
			
			if(numberOfStars[index] % 2 == 0) {
				numberOfStars[index] -= 1;
				index--;
				sum = false;
			}
			
			else {				
				numberOfStars[index] -= 1;
				index++;
			}
			
		}
		
		System.out.println(numberHouses + " " + totalSheep);

		sc.close();
	}
}
