package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14159; 
				
		double A,B,C;
		double rightTriangleArea, circleArea,trapezoidArea, squareArea, triangleArea;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		rightTriangleArea = (A * C)/2.0;
		circleArea = PI * Math.pow(C, 2);
		trapezoidArea = ((A + B) * C)/2.0;
		squareArea = Math.pow(B, 2);
		triangleArea = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", rightTriangleArea);
		System.out.printf("CIRCULO: %.3f%n", circleArea);
		System.out.printf("TRAPEZIO: %.3f%n", trapezoidArea);
		System.out.printf("QUADRADO: %.3f%n", squareArea);
		System.out.printf("RETANGULO: %.3f%n", triangleArea);
		
		sc.close();
	}
}
