package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int password = 2002;
		int input;
		
		do {
			input = sc.nextInt();
			
			if(input != password) {
				System.out.println("Senha Invalida");
			}
			
			else {
				System.out.println("Acesso Permitido");
			}
			
		} while(input != password);
		
		sc.close();
	}
}
