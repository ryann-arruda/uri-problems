package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String H;
		
		do {
			int minutes, result;
			String[] hour;
			
			H = sc.nextLine();
			
			hour = H.split(":");
			minutes = (Integer.parseInt(hour[0]) * 60) + Integer.parseInt(hour[1]);
			
			// 480 is 8 hours in minutes
			result = (minutes + 60) - 480;
			
			if(result <= 0) {
				System.out.println("Atraso maximo: 0");
			}
			
			else {
				System.out.println("Atraso maximo: " + result);	
			}
			
		} while(sc.hasNextLine());
		
		sc.close();
	}
}