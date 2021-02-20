package application;

import java.math.BigDecimal;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		BigDecimal value = new BigDecimal("1");
		BigDecimal result = new BigDecimal("0.0");
		
		for(int k = 1; value.intValue() < 39; value = value.add(new BigDecimal("2")), k *= 2) {

			result = result.add(new BigDecimal(Double.toString(value.doubleValue()/k)));
		}
		
		System.out.println(String.format("%.2f", result.doubleValue()));
	}
}
