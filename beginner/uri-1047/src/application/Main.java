package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int firstHour, secondHour;
		int startingMinutes, finalMinutes;
		
		int hourResult = 0;
		int resultOfMinutes = 0;
		
		firstHour = sc.nextInt();
		startingMinutes = sc.nextInt();
		
		secondHour = sc.nextInt();
		finalMinutes = sc.nextInt();
		
		// Calculation of hours and minutes
		if(firstHour >= secondHour) {
			hourResult = (24 - firstHour) + secondHour;
			
			if(finalMinutes >= startingMinutes) { 
				
				if(firstHour == secondHour && startingMinutes != finalMinutes) {
					hourResult = 0;
				}
				
				resultOfMinutes = finalMinutes - startingMinutes;;
			}
			
			else {
				hourResult--;
				resultOfMinutes = 60 - (startingMinutes - finalMinutes);
			}
		}
		
		else {
			hourResult = secondHour - firstHour;
			
			if(finalMinutes >= startingMinutes) { 				
				resultOfMinutes = finalMinutes - startingMinutes;;
			}
			
			else {
				hourResult--;
				resultOfMinutes = 60 - (startingMinutes - finalMinutes);
			}
		}
		
		System.out.println("O JOGO DUROU " + hourResult + " HORA(S) E " + resultOfMinutes + " MINUTO(S)");
		
		sc.close();
	}
}
