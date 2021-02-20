package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int largestNumber;
		int firstNumber, secondNumber, thirdNumber;
		
		firstNumber = sc.nextInt();
		secondNumber = sc.nextInt();
		thirdNumber = sc.nextInt();
		
		largestNumber = (firstNumber + secondNumber + Math.abs(firstNumber - secondNumber))/2;
		
		if(largestNumber < thirdNumber) {
			System.out.println(thirdNumber + " eh o maior");
		}
		
		else {
			System.out.println(largestNumber + " eh o maior");
		}
		
		sc.close();
	}
}
