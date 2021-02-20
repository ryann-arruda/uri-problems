package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int days = 0, months = 0, years = 0;
		int age;
		
		age = sc.nextInt();
		
		while(age > 0) {
			
			if(age >= 365) {
				years++;
				age -= 365;
			}
			
			else if(age >= 30) {
				months++;
				age -= 30;
				
				if(months == 12) {
					years++;
					months = 0;
				}
			}
			
			else {
				days = age;
				age -= days;
				
				if(days == 30) {
					months++;
					days = 0;
				}
			}
		}
		
		System.out.println(years + " ano(s)");
		System.out.println(months + " mes(es)");
		System.out.println(days + " dia(s)");
		
		sc.close();
	}
}