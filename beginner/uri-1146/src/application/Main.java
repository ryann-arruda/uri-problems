package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		do {
			for(int i = 1; i <= input; i++) {
				
				if(i != input) {
					System.out.print(i + " ");
				}
				
				else {
					System.out.println(i);
				}
			}
			
			input = sc.nextInt();
			
		} while (input != 0);
		
		sc.close();
	}
}
