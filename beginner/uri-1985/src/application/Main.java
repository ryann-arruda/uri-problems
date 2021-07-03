package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int p,q;
		double sum = 0.0;
		
		p = sc.nextInt();
		
		for(int i = 0; i < p; i++) {
			int code = sc.nextInt();
			q = sc.nextInt();
			
			sum += productValue(code) * q;
		}
		
		System.out.printf("%.2f\n", sum);
		
		sc.close();
	}
	
	public static double productValue(int code) {
		double value = 0.0;
		
		switch(code) {
			case 1001:
				value = 1.5;
				break;
			case 1002:
				value = 2.5;
				break;
			case 1003:
				value = 3.5;
				break;
			case 1004:
				value = 4.5;
				break;
			case 1005:
				value = 5.5;
				break;
			default:
				break;
		}
		
		return value;
	}
}
