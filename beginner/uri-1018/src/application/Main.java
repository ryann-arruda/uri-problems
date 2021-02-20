package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int oneHundredQuantity = 0, fiftyQuantity = 0, twentyQuantity = 0, tenQuantity = 0;
		int fiveQuantity = 0, twoQuantity = 0, oneQuanitity = 0;
		int N, auxiliary;
		
		N = sc.nextInt();
		auxiliary = N;
		
		while(N >= 100) {
			oneHundredQuantity += 1;
			N -= 100;
		}
		
		while(N >= 50) {
			fiftyQuantity += 1;
			N -= 50;
		}
		
		while(N >= 20) {
			twentyQuantity += 1;
			N -= 20;
		}
		
		while(N >= 10) {
			tenQuantity += 1;
			N -= 10;
		}
		
		while(N >= 5) {
			fiveQuantity += 1;
			N -= 5;
		}
		
		while(N >= 2) {
			twoQuantity += 1;
			N -= 2;
		}
		
		while(N >= 1) {
			oneQuanitity += 1;
			N -= 1;
		}
		
		System.out.println(auxiliary);
		System.out.println(oneHundredQuantity + " nota(s) de R$ 100,00");
		System.out.println(fiftyQuantity + " nota(s) de R$ 50,00");
		System.out.println(twentyQuantity + " nota(s) de R$ 20,00");
		System.out.println(tenQuantity + " nota(s) de R$ 10,00");
		System.out.println(fiveQuantity + " nota(s) de R$ 5,00");
		System.out.println(twoQuantity + " nota(s) de R$ 2,00");
		System.out.println(oneQuanitity + " nota(s) de R$ 1,00");
		
		sc.close();
	}
}
