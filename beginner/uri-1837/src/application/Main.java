package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, q, r;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		q = a/b;
		r = a - (b * q);
		
		while(r < 0) {			
			if(q <= 0 && b > 0) {
				q--;
			}
			
			else {
				q++;
			}
			
			r = a - (b * q);	
		}
		
		System.out.println(q + " " + r);
		
		sc.close();
	}
}
