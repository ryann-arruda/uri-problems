package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int QT = sc.nextInt();
		
		for(int i = 0; i < QT; i++) {
			String[] names = new String[2];
			String[] choices = new String[2];
			int[] values = new int[2];
			
			names[0] = sc.next();
			choices[0] = sc.next();
			names[1] = sc.next();
			choices[1] = sc.next();
			
			values[0] = sc.nextInt();
			values[1] = sc.nextInt();			
			
			checkWinner(names, choices, values);
		}
		
		sc.close();
	}
	
	public static void checkWinner(String[] names, String[] choices, int[] values) {
		int sum = values[0] + values[1];
		String result = "IMPAR";
		
		if(sum % 2 == 0) {
			result = "PAR";
		}
		
		for(int i = 0; i < choices.length; i++) {
			
			if(choices[i].equals(result)) {
				System.out.println(names[i]);
			}
		}
	}
}
