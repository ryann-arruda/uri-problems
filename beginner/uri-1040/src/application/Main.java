package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float average;
		float[] notes = new float[4];
		
		notes[0] = sc.nextFloat();
		notes[1] = sc.nextFloat();
		notes[2] = sc.nextFloat();
		notes[3] = sc.nextFloat();
		
		average = ((2f * notes[0]) + (3f * notes[1]) + (4f * notes[2]) + (1f * notes[3]))/10f;
		
		if(average >= 7f) {
			System.out.printf("Media: %.1f%n", average);
			System.out.println("Aluno aprovado.");
		}
		
		else if(average >= 5f && average < 7f) {
			System.out.printf("Media: %.1f%n", average);
			System.out.println("Aluno em exame.");
			
			float examGrade = sc.nextFloat();
			
			System.out.println("Nota do exame: " + examGrade);
			
			average = (average + examGrade)/2;
			
			if(average >= 5f) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n", average);
			}
			
			else {
				System.out.println("Aluno reprovado.");
				System.out.printf("Media final: %.1f%n", average);
			}
		}
		
		else {
			System.out.printf("Media: %.1f%n", average);
			System.out.println("Aluno reprovado.");
		}
		
		sc.close();
	}
}