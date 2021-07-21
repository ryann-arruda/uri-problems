package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberWindows, numberActions;
		
		numberWindows = sc.nextInt();
		numberActions = sc.nextInt();
		
		for(int i = 0; i < numberActions; i++) {
			String action = sc.next();
			
			if(action.equals("fechou")) {
				numberWindows--;
				numberWindows += 2;
			}
			
			else {
				numberWindows--;
			}
		}
		
		System.out.println(numberWindows);
		
		sc.close();
	}
}