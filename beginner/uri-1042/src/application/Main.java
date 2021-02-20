package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] orderedValues = new int[3];
		int[] unorderedValues = new int[3];
		
		for(int i = 0; i < 3; i++) {
			unorderedValues[i] = sc.nextInt();
			orderedValues[i] = unorderedValues[i];
		}
		
		// Values ordered in ascending order
		for(int i = 0; i < 2; i++) {
			
			for(int j = i + 1; j < 3; j++) {
				
				if(orderedValues[j] < orderedValues[i]){
					int value = orderedValues[i];
					
					orderedValues[i] = orderedValues[j];
					orderedValues[j] = value;
				}
			}
		}
		
		for(int i = 0; i < 3; i++) {
			System.out.println(orderedValues[i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			System.out.println(unorderedValues[i]);
		}
		
		sc.close();
	}
}
