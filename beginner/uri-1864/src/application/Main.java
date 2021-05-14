package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String phrase = "LIFE IS NOT A PROBLEM TO BE SOLVED";
		
		int input = sc.nextInt();
		
		for(int i = 0; i < input; i++) {
			if(i == input - 1) {
				System.out.println(phrase.charAt(i));
			}
			
			else {
				System.out.print(phrase.charAt(i));
			}
		}
		
		sc.close();
	}
}
