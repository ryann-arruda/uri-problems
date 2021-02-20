package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstValue, secondValue;
		
		do{
			firstValue = sc.nextInt();
			secondValue = sc.nextInt();
			
			if(firstValue > 0 && secondValue > 0) {
				System.out.println("primeiro");
			}
			
			else if(firstValue < 0 && secondValue > 0) {
				System.out.println("segundo");
			}
			
			else if(firstValue < 0 && secondValue < 0) {
				System.out.println("terceiro");
			}
			
			else if(firstValue > 0 && secondValue < 0) {
				System.out.println("quarto");
			}
			
		}while(firstValue != 0 && secondValue != 0);
		
		sc.close();
	}
}
