package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double firstNote, secondNote, average;
		
		firstNote = sc.nextDouble();
		secondNote = sc.nextDouble();
		
		average = ((3.5 * firstNote) + (7.5 * secondNote))/11.0;
		
		System.out.printf("MEDIA = %.5f%n", average);
		
		sc.close();
	}
}
