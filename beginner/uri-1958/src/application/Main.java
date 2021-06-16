package application;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String number;
		
		number = Double.toString(sc.nextDouble());
		
		System.out.println(scientificNotationConverter(number));;
	
		sc.close();
	}
	
	public static String scientificNotationConverter(String numberOriginal) {
		String result = "", signal = "", aux;
		int exponentValue = 0, pointPosition;
		BigDecimal value = new BigDecimal(numberOriginal);
		
		// Checks if the number is positive and adds a sign on the print
		if(numberOriginal.charAt(0) != '-') {
			result = "+";
		}
		
		else {
			/* If the number equals zero but starts with a minus sign, the minus sign is added
			 * to the printout to indicate the type of number entered (positive or negative).*/
			if(value.doubleValue() == 0.0) {
				result = "-";
			}
		}
		
		aux = value.toString();
		
		pointPosition = value.abs().toString().indexOf(".");
		
		if(pointPosition > 1) {
			/* If the number is positive but greater than 10.0, you must move the dot  
			 * to place the number in the scientific notation pattern (number >= 1 && 
			 * number < 10)*/ 
			if(value.doubleValue() > 0.0) {
				exponentValue = pointPosition - 1;
			}
			
			/* If the number is negative but greater than 10.0, the dot must also be  
			 * moved to place the number in scientific notation pattern, but  
			 * considering the negative sign when moving the dot.*/
			else {
				pointPosition++;
				exponentValue = pointPosition - 2;
			}
			
			value = value.movePointLeft(exponentValue);
			signal = "+";
		}
		
		else {
			
			if(value.doubleValue() != 0.0) {
				String number;
				
				if(value.doubleValue() < 0.0) {
					pointPosition++;
				}
				
				number = Character.toString(aux.charAt(pointPosition - 1));
				
				/* If the first number before the dot is zero, then the number must be 
				 * placed in standard scientific notation (number> = 1 && number <10) 
				 * and the sign of the exponent is added as negative, because it is 
				 * moving to the right.*/
				if(Integer.parseInt(number) < 1) {
					exponentValue = 1;
					
					for(int i = pointPosition + 1; i < aux.length(); i++, exponentValue++) {
						number = Character.toString(aux.charAt(i));
								
						if(Integer.parseInt(number) > 0) {
							value = value.movePointRight(exponentValue);
							signal = "-";
							break;
						}
					}
				}
				
				else {
					signal = "+";
				}
			}
			
			/*If the number is zero the sign of the E is positive*/
			else {
				signal = "+";
			}
		}
		
		aux = value.toString();
		
		/* When the number has 5 or more decimal places, it is rounded (if the 
		 * number in the 5th position is  >= 5) and reduced to 4 decimal places  
		 * in this special case (when the 5th value is less than 9).*/
		if(pointPosition + 5 <= (aux.length() - 1)) {
			String number = Character.toString(aux.charAt(pointPosition + 5));
			
			if(Integer.parseInt(number) >= 5) {
				StringBuilder sb = new StringBuilder(aux);
				
				roundingNumbers(sb,pointPosition + 4);
				
				for(int i = pointPosition + 5; i < sb.length();) {
					sb.deleteCharAt(i);
				}
				
				aux = sb.toString();
			}
		}
		
		aux = decimalDelimiter(4, aux);
		
		if(!aux.contains("E")) {
			
			if(exponentValue >= 10) {
				result = result.concat(aux + "E" + signal + exponentValue);
			}
			
			else {
				result = result.concat(aux + "E" + signal + "0" + exponentValue);	
			}
		}
		
		else {
			result = result.concat(aux);
		}
		
		
		return result;
	}
	
	public static void roundingNumbers(StringBuilder sb, int startPosition) {
		String number;
		int aux;
		
		/* This "if" block guarantees the rounding of the number before the point 
		 * if we have situations like 2.99999*/
		if(sb.charAt(startPosition + 1) == '.') {
			int auxPosition = startPosition;
			char numericConcatenator = sb.charAt(auxPosition);
			number = "";

			do {
				number = number.concat(Character.toString(numericConcatenator));
				numericConcatenator = sb.charAt(++auxPosition);
				
			}while(numericConcatenator != '.');
		}
		
		else {
			number = Character.toString(sb.charAt(startPosition));
		}
		
		aux = Integer.parseInt(number);
		
		aux++;
		
		if(aux == 10 && (sb.charAt(startPosition + 1) != '.')) {
			aux = 0;
			sb.setCharAt(startPosition, '0');
			
			if(sb.charAt(startPosition - 1) == '.') {
				roundingNumbers(sb, 0);
			}
			
			else {
				roundingNumbers(sb, startPosition - 1);
			}
		}
		
		else {
			number = Integer.toString(aux);
			
			/* Deleting the number before the dot and inserting the new rounded 
			 * number before the dot in situations 2.99999*/
			if(sb.charAt(startPosition + 1) == '.') {
				sb.deleteCharAt(0);
				sb.insert(0, number);
			}
			
			else {
				sb.setCharAt(startPosition, number.charAt(0));
			}
		}
	}
	
	public static String decimalDelimiter(int numberDecimalPlaces, String originalNumber) {
		int numberDecimalPlacesOriginal = 0;
		StringBuilder sb = new StringBuilder(originalNumber);
		
		if(!originalNumber.contains("E")) {
			if(originalNumber.charAt(0) == '-') {
				numberDecimalPlacesOriginal = originalNumber.length() - 3;
			}
			
			else {
				// The value 2 refers to the first position of the decimal place
				numberDecimalPlacesOriginal = originalNumber.length() - 2;
			}
		}
		
		else {
			/* The variable indexFor start 2 because it's the first position of the decimal place*/
			int indexOfE, indexFor = 2;
			
			indexOfE = originalNumber.indexOf('E');
			
			if(originalNumber.charAt(0) == '-') {
				indexFor++;
			}
			
			for(; indexFor < indexOfE; indexFor++) {
				numberDecimalPlacesOriginal++;
			}
		}
		
		if(numberDecimalPlacesOriginal > 4) {
			String number = Character.toString(originalNumber.charAt(5));
			
			if(Integer.parseInt(number) >= 5) {
				roundingNumbers(sb, 5);
			}
		}
		
		else {
			// The number 4 refers to the number of decimal places that the number must have
			for(int i = 4 - numberDecimalPlacesOriginal; i > 0; i--) {

				if(originalNumber.contains("E")){
					sb.insert(sb.indexOf("E") - 1, '0');
				}
				
				else {
					sb.append("0");
				}
			}
		}
		// If the number has more decimal places than necessary, then they will be deleted
		for(int i = numberDecimalPlacesOriginal - numberDecimalPlaces; i > 0; i--) {
			
			if(originalNumber.contains("E")) {
				sb.deleteCharAt(sb.indexOf("E") - 1);
			}
			
			else {
				sb.deleteCharAt(sb.length() - 1);
			}
		}
		
		return sb.toString();
	}
}