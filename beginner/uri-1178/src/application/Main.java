package application;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.0000");
		df.setRoundingMode(RoundingMode.HALF_EVEN);
		
		BigDecimal[] N = new BigDecimal[100];
		
		N[0] = new BigDecimal(Math.floor(sc.nextBigDecimal().doubleValue()));
		
		for(int i = 1;  i < 100; i++) {
			N[i] = new BigDecimal(N[i - 1].divide(new BigDecimal("2.0")).toString());
		}
		
		for(int i = 0; i < 100; i++) {
			System.out.println("N[" + i + "] = " + df.format(N[i]));
		}
		
		sc.close();
	}
}
