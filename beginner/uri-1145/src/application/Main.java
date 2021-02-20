package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 1;
		int X, Y;
		
		X = sc.nextInt();
		Y = sc.nextInt();
		
		for(int i = 1; i <= Y; i++) {
			
			if(count < X) {
				System.out.print(i + " ");
				count++;
			}
			
			else {
				System.out.println(i);
				count = 1;
			}
		}
		
		sc.close();
	}
}
