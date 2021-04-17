package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		do {
			int best = 0;
			int L = sc.nextInt();
		
			for(int i = 0; i < L; i++) {
				int V = sc.nextInt();
				
				if(V > best) {
					best = V;
				}
			}
			
			if(best < 10) {
				System.out.println(1);
			}
			
			else if(best >= 10 && best < 20) {
				System.out.println(2);
			}
			
			else {
				System.out.println(3);
			}
			
		} while(sc.hasNextInt());
		
		sc.close();
	}
}
