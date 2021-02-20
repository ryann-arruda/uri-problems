package application;

import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		BigDecimal I = new BigDecimal("0.0");
		
		for(; I.doubleValue() <= 2.0; I = I.add(new BigDecimal("0.2"))) {
			
			for(int k = 1; k <= 3; k++) {
				BigDecimal J = new BigDecimal(String.valueOf(k));
				
				if(I.doubleValue() - I.intValue() == 0.0) {
					J = J.add(I);
					
					System.out.println("I=" + I.intValue() + " J=" + J.intValue());
				}
				
				else {
					J = J.add(I);
					
					System.out.println("I=" + I.doubleValue() + " J=" + J.doubleValue());
				}
			}
		}
	}
}
