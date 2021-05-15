package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int N, C;
		
		C = sc.nextInt();
		
		for(int i = 0; i < C; i++) {
			name = sc.next();
			N = sc.nextInt();
			
			if(name.equals("Thor")) {
				System.out.println("Y");
			}
			
			else {
				System.out.println("N");
			}
		}
		
		sc.close();
	}
}
