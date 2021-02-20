package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {
			int pow = (int) Math.pow(i, 2);
			
			if(i % 2 == 0) {
				System.out.println(i + "^2 = " + pow);
			}
		}
		
		sc.close();
	}
}
