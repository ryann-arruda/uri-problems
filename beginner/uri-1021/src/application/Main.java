package application;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// Paper Money
		int oneHundredQuantity = 0, fiftyQuantity = 0, twentyQuantity = 0, tenQuantity = 0, fiveQuantity = 0, twoQuantity = 0;
		
		// Coin
		int oneQuantity = 0, zeroFiftyQuantity = 0, zeroTwentyFiveQuantity = 0, zeroTenQuantity = 0, zeroFiveQuantity = 0, zeroOneQuantity = 0;
		
		// BigDecimal was used to correct the storage of double values by the JVM
		BigDecimal N;
		
		N = new BigDecimal(String.valueOf(sc.nextDouble()));
		
		// Paper
		while(N.doubleValue() >= 2.00) {
			
			if(N.doubleValue() >= 100.00) {
				oneHundredQuantity++;
				N = N.subtract(new BigDecimal("100.00"));
			}
			
			else if(N.doubleValue() >= 50.00) {
				fiftyQuantity++;
				N = N.subtract(new BigDecimal("50.00"));
			}
			
			else if(N.doubleValue() >= 20.00) {
				twentyQuantity++;
				N = N.subtract(new BigDecimal("20.00"));
			}
			
			else if(N.doubleValue() >= 10.00) {
				tenQuantity++;
				N = N.subtract(new BigDecimal("10.00"));
			}
			
			else if(N.doubleValue() >= 5.00) {
				fiveQuantity++;
				N = N.subtract(new BigDecimal("5.00"));
			}
			
			else {
				twoQuantity++;
				N = N.subtract(new BigDecimal("2.00"));
			}
		}
		
		// Coin
		while(N.doubleValue() > 0.00) {
			
			if(N.doubleValue() >= 1.00) {
				oneQuantity++;
				N = N.subtract(new BigDecimal("1.00"));
			}
			
			else if(N.doubleValue() >= 0.50) {
				zeroFiftyQuantity++;
				N = N.subtract(new BigDecimal("0.50"));
			}
			
			else if(N.doubleValue() >= 0.25) {
				zeroTwentyFiveQuantity++;
				N = N.subtract(new BigDecimal("0.25"));
			}
			
			else if(N.doubleValue() >= 0.10) {
				zeroTenQuantity++;
				N = N.subtract(new BigDecimal("0.10"));
			}
			
			else if(N.doubleValue() >= 0.05) {
				zeroFiveQuantity++;
				N = N.subtract(new BigDecimal("0.05"));
			}
			
			else if(N.doubleValue() >= 0.01){
				zeroOneQuantity++;
				N = N.subtract(new BigDecimal("0.01"));
			}
		}
		
		System.out.println("NOTAS:");
		System.out.println(oneHundredQuantity + " nota(s) de R$ 100.00");
		System.out.println(fiftyQuantity + " nota(s) de R$ 50.00");
		System.out.println(twentyQuantity + " nota(s) de R$ 20.00");
		System.out.println(tenQuantity + " nota(s) de R$ 10.00");
		System.out.println(fiveQuantity + " nota(s) de R$ 5.00");
		System.out.println(twoQuantity + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(oneQuantity + " moeda(s) de R$ 1.00");
		System.out.println(zeroFiftyQuantity + " moeda(s) de R$ 0.50");
		System.out.println(zeroTwentyFiveQuantity + " moeda(s) de R$ 0.25");
		System.out.println(zeroTenQuantity + " moeda(s) de R$ 0.10");
		System.out.println(zeroFiveQuantity + " moeda(s) de R$ 0.05");
		System.out.println(zeroOneQuantity	 + " moeda(s) de R$ 0.01");
		
		sc.close();
	}
}