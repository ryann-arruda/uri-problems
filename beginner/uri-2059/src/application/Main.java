package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int p, j1, j2, r, a, sum;
		
		p = sc.nextInt();
		j1 = sc.nextInt();
		j2 = sc.nextInt();
		r = sc.nextInt();
		a = sc.nextInt();
		
		sum = j1 + j2;
		
		if(p == 1) {
			
			if(sum % 2 == 0) {
				
				if(r == 1) {
					if(a == 1) {
						System.out.println("Jogador 2 ganha!");
					}
					
					else {
						System.out.println("Jogador 1 ganha!");
					}
				}
				
				else {
					System.out.println("Jogador 1 ganha!");
				}
			}
			
			else {
				if(r == 1) {
					if(a == 1) {
						System.out.println("Jogador 2 ganha!");
					}
					
					else {
						System.out.println("Jogador 1 ganha!");
					}
				}
				
				else {
					System.out.println("Jogador 2 ganha!");
				}
			}
		}
		
		else {
			if(sum % 2 != 0) {
				
				if(r == 1) {
					if(a == 1) {
						System.out.println("Jogador 2 ganha!");
					}
					
					else {
						System.out.println("Jogador 1 ganha!");
					}
				}
				
				else {
					System.out.println("Jogador 1 ganha!");
				}
			}
			
			else {
				if(r == 1) {
					if(a == 1) {
						System.out.println("Jogador 2 ganha!");
					}
					
					else {
						System.out.println("Jogador 1 ganha!");
					}
				}
				
				else {
					System.out.println("Jogador 2 ganha!");
				}
			}
		}
		
		sc.close();
	}
}
