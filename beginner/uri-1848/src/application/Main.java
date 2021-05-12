package application;

import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String line = null;
		int number = 0;
		
		do {
			line = sc.nextLine();
			
			if(!line.equals("caw caw")) {
				
				for(int i = 0, k = 2; i < 3; i++, k--) {
					if(line.charAt(i) == '*') {
						number += Math.pow(2, k);
					}
				}
			}
			
			else {
				System.out.println(number);
				number = 0;
			}
			
		} while(sc.hasNextLine());
		
		sc.close();
	}
}