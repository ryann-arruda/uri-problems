package application;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double V, D;
		BigDecimal height, area;
		
		do {
			V = sc.nextDouble();
			D = sc.nextDouble();
			
			height = new BigDecimal(V/(3.14 * Math.pow(D/2, 2))).setScale(2, RoundingMode.HALF_UP);
			area = new BigDecimal(3.14 * Math.pow(D/2, 2)).setScale(2, RoundingMode.HALF_EVEN);
			
			System.out.println(String.format("ALTURA = %.2f", height.doubleValue()));
			System.out.println(String.format("AREA = %.2f", area.doubleValue()));
			
		} while(sc.hasNextDouble());
		
		sc.close();
	}
}
