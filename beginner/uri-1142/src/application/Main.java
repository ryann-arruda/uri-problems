package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int j = 1;
		
		int lines = sc.nextInt();
		
		for(int i = 0; i < lines; i++) {
			
			System.out.println(j + " " + (j + 1) + " " + (j + 2) + " PUM");
			
			j += 4;
		}
		
		sc.close();
	}
}
