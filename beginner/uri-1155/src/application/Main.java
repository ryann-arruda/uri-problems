package application;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		BigDecimal result = new BigDecimal("0.0");
		BigDecimal S = new BigDecimal("1.0");
		
		for(int i = 1; i <= 100; i++) {
			result = result.add(S.divide(new BigDecimal("" + (double)i), 3, RoundingMode.HALF_UP));
		}
		
		System.out.println(String.format("%.2f", result.doubleValue()));
	}
}
