package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
     	String[] firstDateStorage = new String[2], firstHourStorage = new String[3];
     	String[] secondDateStorage = new String[2], secondHourStorage = new String[3];
     	
     	int startDay, endDay;
     	int startTime, endTime;
     	int startingMinutes, finalMinutes;
     	int initialSeconds, finalSeconds;
     	
     	int totalDays, hourResult, resultOfMinutes, secondsResult;

     	// Store and enter the start date and time
		firstDateStorage = sc.nextLine().split(" ");
		startDay = Integer.parseInt(firstDateStorage[1]);
		
		firstHourStorage = sc.nextLine().split(" : ");
		startTime = Integer.parseInt(firstHourStorage[0]);
		startingMinutes = Integer.parseInt(firstHourStorage[1]);
		initialSeconds = Integer.parseInt(firstHourStorage[2]);
		
		// Store and enter the end date and time
		secondDateStorage = sc.nextLine().split(" ");
		endDay = Integer.parseInt(secondDateStorage[1]);
		
		secondHourStorage = sc.nextLine().split(" : ");
		endTime = Integer.parseInt(secondHourStorage[0]);
		finalMinutes = Integer.parseInt(secondHourStorage[1]);
		finalSeconds = Integer.parseInt(secondHourStorage[2]);
		
		// Calculation of the day, hour and minutes
		if(startTime >= endTime) {
			hourResult = (24 - startTime) + endTime;
			totalDays = (endDay - startDay) - 1;
			
			if(finalMinutes >= startingMinutes) { 
				
				if(startTime == endTime && startingMinutes != finalMinutes) {
					hourResult = 0;
					totalDays++;
				}
				
				resultOfMinutes = finalMinutes - startingMinutes;
			}
			
			else {
				hourResult--;
				resultOfMinutes = 60 - (startingMinutes - finalMinutes);
			}
			
			if(hourResult == 24) {
				totalDays++;
				hourResult = 0;
			}
		}
		
		else {
			hourResult = endTime - startTime;
			
			if(finalMinutes >= startingMinutes) { 				
				resultOfMinutes = finalMinutes - startingMinutes;;
			}
			
			else {
				hourResult--;
				resultOfMinutes = 60 - (startingMinutes - finalMinutes);
			}
			
			totalDays = endDay - startDay;
		}
		
		// Calculation of seconds
		if(finalSeconds >= initialSeconds) {
			secondsResult = finalSeconds - initialSeconds;
		}
		
		else {
			secondsResult = (60 - initialSeconds) + finalSeconds;
			
			if(resultOfMinutes > 0) {
				resultOfMinutes--;
			}
			
			else {
				hourResult--;
				resultOfMinutes = 59;
			}
		}
		
		System.out.println(totalDays + " dia(s)");
		System.out.println(hourResult + " hora(s)");
		System.out.println(resultOfMinutes + " minuto(s)");
		System.out.println(secondsResult + " segundo(s)");
		
		sc.close();
	}
}
