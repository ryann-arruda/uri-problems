package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int lines = sc.nextInt();
		
		for(int i = 1; i <= lines; i++) {
			System.out.println(i + " " + (int)Math.pow(i, 2) + " " + (int)Math.pow(i, 3));
		}
		
		sc.close();
	}
}
