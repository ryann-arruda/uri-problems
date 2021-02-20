package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int seconds = 0, minutes = 0, hours = 0;
		int N;
		
		N = sc.nextInt();
		
		while(N > 0) {
			
			if(N >= 60) {
				minutes += 1;
				N -= 60;
				
				if(minutes == 60) {
					hours += 1;
					minutes -= 60;
				}
			}
			
			else {
				seconds += N;
				N -= seconds;
			}
		}
		
		System.out.println(hours + ":" + minutes + ":" + seconds);
		
		sc.close();
	}
}	