package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int P, N, lastHeight = 0, currentHeight = 0;
		boolean win = true;
		
		P = sc.nextInt();
		N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			lastHeight = currentHeight;
			currentHeight = sc.nextInt();
			
			if(lastHeight == 0) {
				lastHeight = currentHeight;
				continue;
			}
			
			else {
				int difference = currentHeight - lastHeight;
						
				if(difference > P || difference < -P) {
					win = false;
					break;
				}
			}
		}
		
		if(win) {
			System.out.println("YOU WIN");
		}
		
		else {
			System.out.println("GAME OVER");
		}
		
		sc.close();
	}
}