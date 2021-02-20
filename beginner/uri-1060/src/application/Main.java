package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		for(int i = 0; i < 6; i++) {
			double number = sc.nextDouble();
			
			if(number > 0.0) {
				count++;
			}
		}
		
		System.out.println(count + " valores positivos");
		
		sc.close();
	}
}
