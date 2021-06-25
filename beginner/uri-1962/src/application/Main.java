package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int T = sc.nextInt();
			
			System.out.println(yearIndicator(T, 2015));
		}
		
		sc.close();
	}
	
	public static String yearIndicator(int timeHasPassed, int referenceYear) {
		int result;
		
		if(timeHasPassed > referenceYear) {
			result = timeHasPassed - referenceYear;
			result++;
			
			return String.format("%d A.C.", result);
		}
		
		result = referenceYear - timeHasPassed;
		
		if(result == 0) {
			result = 1;
			return String.format("%d A.C.", result);
		}
		
		return String.format("%d D.C.", result);
	}
}
