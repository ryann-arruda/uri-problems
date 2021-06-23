package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String result = "";
		int N = sc.nextInt();
		
		System.out.println(calculateValue(N, result));
		sc.close();
	}
	
	public static String romanValue(int value) {
		String romanValue;
		
		switch(value) {
			case 1:
				romanValue = "I";
				break;
			case 4:
				romanValue = "IV";
				break;
			case 5:
				romanValue =  "V";
				break;
			case 9: 
				romanValue = "IX";
				break;
			case 10:
				romanValue =  "X";
				break;
			case 40:
				romanValue = "XL";
				break;
			case 50:
				romanValue =  "L";
				break;
			case 90:
				romanValue = "XC";
				break;
			case 100:
				romanValue =  "C";
				break;
			case 400:
				romanValue = "CD";
				break;
			case 500:
				romanValue =  "D";
				break;
			case 900:
				romanValue = "CM";
				break;
			case 1000:
				romanValue =  "M";
				break;
			default:
				romanValue = null;
				break;
		}
		
		return romanValue;
	}
	
	public static String calculateValue(int value, String result) {
		String auxCheck = romanValue(value);
		
		if(auxCheck != null) {
			value = 0;
			result = result.concat(auxCheck);
		}

		if(value >= 500) {
			int aux = value - 500;
			
			if(aux == 500) {
				result = romanValue(value);
			}
			
			else if(aux >= 400) {
				result = result.concat(romanValue(900));
				result = calculateValue(value - 900, result);
			}
			
			else {
				result = result.concat(romanValue(500));
				result = calculateValue(aux, result);				
			}
		}
		
		else if(value >= 400) {
			value -= 400;
			result = result.concat(romanValue(400));
			result = calculateValue(value, result);
		}
		
		else if(value > 100) {
			while (value >= 100) {
				value -= 100;
				result = result.concat(romanValue(100));
			} 
			
			result = calculateValue(value, result);
		}
		
		else if(value >= 90) {
			value -= 90;
			result = result.concat(romanValue(90));
			result = calculateValue(value, result);
		}
		
		else if(value >= 40 && value < 50) {
			value -= 40;
			result = result.concat(romanValue(40));
			result = calculateValue(value, result);
		}
		
		else if(value >= 50) {
			value -= 50;
			result = result.concat(romanValue(50));
			result = calculateValue(value, result);
		}
		
		else if(value >= 10) {
				
			while (value >= 10) {
				value -= 10;
				result = result.concat(romanValue(10));
			} 
			
			result = calculateValue(value, result);
		}
		
		else if(value == 4) {
			value -= 4;
			result = result.concat(romanValue(4));
			result = calculateValue(value, result);
		}
		
		else if(value >= 5) {
			int number = value == 9 ? 9 : 5;
			
			value -= number;
			result = result.concat(romanValue(number));
			result = calculateValue(value, result);
		}
		
		else if(value >= 1){
			
			while(value >= 1) {
				value -= 1;
				result = result.concat(romanValue(1));
			}
			
			result = calculateValue(value, result);
		}
		
		return result;
	}
}
