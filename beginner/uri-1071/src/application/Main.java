package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X, Y;
		int sum = 0;
		
		X = sc.nextInt();
		Y = sc.nextInt();
		
		if(X > Y) {
			
			for(int i = Y + 1; i < X; i++) {

				if(i % 2 != 0) {
					sum += i;
				}
			}
			
			System.out.println(sum);
		}
		
		else {
			
			for(int i = X + 1; i < Y; i++) {
				
				if(i % 2 != 0) {
					sum += i;
				}
			}
			
			System.out.println(sum);
		}
		
		sc.close();
	}
}
