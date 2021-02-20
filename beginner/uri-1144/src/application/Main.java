package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int alternador = 1, count = 1;
		int input = sc.nextInt();
		
		for(int k = 0; k < (input * 2); k++) {
			
			if(alternador == 1) {
				System.out.println(count + " " + (int)Math.pow(count, 2) + " " + (int)Math.pow(count, 3));
				alternador++;
			}
			
			else {
				System.out.println(count + " " + ((int)Math.pow(count, 2) + 1) + " " + ((int)Math.pow(count, 3) + 1));
				alternador = 1;
				count++;
			}
		}
		
		sc.close();
	}
}
