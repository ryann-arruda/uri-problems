package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int in = 0, out = 0;
		int cases;
		
		cases = sc.nextInt();
		
		for(int i = 0; i < cases; i++) {
			int value = sc.nextInt();
			
			if(value >= 10 && value <= 20) {
				in++;
			}
			
			else {
				out++;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		sc.close();
	}
}
