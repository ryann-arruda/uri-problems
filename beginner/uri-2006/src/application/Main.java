package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T, correct = 0;
		
		T = sc.nextInt();
		
		for(int i = 0; i < 5; i++) {
			int participantChoise = sc.nextInt();
			
			if(participantChoise == T) {
				correct++;
			}
		}
		
		System.out.println(correct);
		
		sc.close();
	}
}