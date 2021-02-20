package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstHour, secondHour;
		
		firstHour = sc.nextInt();
		secondHour = sc.nextInt();
		
		if(firstHour >= secondHour) {
			int result = (24 - firstHour) + secondHour;
			
			System.out.println("O JOGO DUROU " + result + " HORA(S)");
		}
		
		else {
			int result = secondHour - firstHour;
			
			System.out.println("O JOGO DUROU " + result + " HORA(S)");			
		}
		
		sc.close();
	}
}
