package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		double average = 0.0;
		double[] numbers= new double[6];
		
		for(int i = 0; i < 6; i++) {
			double number = sc.nextDouble();
			
			if(number > 0.0) {
				numbers[count] = number;
				count++;
			}
		}
		
		for(int i = 0; i < count; i++) {
			average += numbers[i];
		}
		
		average /= count;
		
		System.out.println(count + " valores positivos");
		System.out.println(String.format("%.1f", average));
		
		sc.close();
	}
}
