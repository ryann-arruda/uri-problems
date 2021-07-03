package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder(String.valueOf(sc.nextLong()));
		
		sb.reverse();
		
		System.out.println(sb.toString());
		
		sc.close();
	}
}