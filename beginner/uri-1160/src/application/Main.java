package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			int years = 0;
			
			int PA = sc.nextInt();
			int PB = sc.nextInt();
			
			double G1 = sc.nextDouble();
			double G2 = sc.nextDouble();
			
			while(PA <= PB) {
				PA = (int) (PA * (100.0 + G1)/100.0);
				
				if(G2 != 0.0) {
					PB = (int) (PB * (100.0 + G2)/100.0);;
				}
				
				years++;
				
				if(years > 100) {
					break;
				}
			}
			
			if(years > 100) {
				System.out.println("Mais de 1 seculo.");
			}
			
			else {
				System.out.println(years + " anos.");
			}
			
		}
		
		sc.close();
	}
}
