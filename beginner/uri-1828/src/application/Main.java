package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 0; i < T; i++) {
			String sheldon = sc.next();
			String raj = sc.next();
			
			checkWin(sheldon, raj, i + 1);
		}
		
		sc.close();
	}
	
	public static void checkWin(String sheldon, String raj, int index) {
		
		if(sheldon.equals("pedra") && !sheldon.equals(raj)) {
			if(raj.equals("lagarto") || raj.equals("tesoura")) {
				System.out.println("Caso #" + index + ": Bazinga!");
			}
			
			else {
				System.out.println("Caso #" + index + ": Raj trapaceou!");
			}
		}
		
		else if(sheldon.equals("papel") && !sheldon.equals(raj)) {
			if(raj.equals("pedra") || raj.equals("Spock")) {
				System.out.println("Caso #" + index + ": Bazinga!");
			}
			
			else {
				System.out.println("Caso #" + index + ": Raj trapaceou!");
			}
		}
		
		else if(sheldon.equals("tesoura") && !sheldon.equals(raj)) {
			if(raj.equals("papel") || raj.equals("lagarto")) {
				System.out.println("Caso #" + index + ": Bazinga!");
			}
			
			else {
				System.out.println("Caso #" + index + ": Raj trapaceou!");
			}
		}
		
		else if(sheldon.equals("lagarto") && !sheldon.equals(raj)) {
			if(raj.equals("Spock") || raj.equals("papel")) {
				System.out.println("Caso #" + index + ": Bazinga!");
			}
			
			else {
				System.out.println("Caso #" + index + ": Raj trapaceou!");
			}
		}
		
		else if(sheldon.equals("Spock") && !sheldon.equals(raj)) {
			if(raj.equals("tesoura") || raj.equals("pedra")) {
				System.out.println("Caso #" + index + ": Bazinga!");
			}
			
			else {
				System.out.println("Caso #" + index + ": Raj trapaceou!");
			}
		}
		
		if(sheldon.equals(raj)) {
			System.out.println("Caso #" + index + ": De novo!");
		}
	}
}
