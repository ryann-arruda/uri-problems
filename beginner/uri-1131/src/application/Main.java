package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int interWins = 0, gremioWins = 0, tie = 0, numberMatches = 1;
		boolean newRound = true;
		
		do {
			int choose = 1;
			int inter = sc.nextInt();
			int gremio = sc.nextInt();
			
			if(inter > gremio) {
				interWins++;
			}
			
			else if(gremio > inter) {
				gremioWins++;
			}
			
			else {
				tie++;
			}
			
			do {
				System.out.println("Novo grenal (1-sim 2-nao)");
				choose = sc.nextInt();
				
				if(choose == 1) {
					numberMatches++;
				}
				
				else if(choose == 2) {
					newRound = false;
				}
				
			} while(choose != 1 && choose != 2);
			
		} while(newRound);
		
		System.out.println(numberMatches + " grenais");
		System.out.println("Inter:" + interWins);
		System.out.println("Gremio:" + gremioWins);
		System.out.println("Empates:" + tie);
		
		if(interWins > gremioWins) {
			System.out.println("Inter venceu mais");
		}
		
		else if(interWins < gremioWins){
			System.out.println("Gremio venceu mais");
		}
		
		else {
			System.out.println("Nao houve vencedor");
		}
		
		sc.close();
	}
}
