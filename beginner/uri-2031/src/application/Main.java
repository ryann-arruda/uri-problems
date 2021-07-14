package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			String firstPlayer = sc.next();
			String secondPlayer = sc.next();
			
			System.out.println(winner(firstPlayer, secondPlayer));
		}
		
		sc.close();
	}
	
	public static String winner(String firstPlayer, String secondPlayer) {
		
		if(firstPlayer.equals("ataque") && !secondPlayer.equals("ataque")) {
			return "Jogador 1 venceu";
		}
		
		else if(firstPlayer.equals("pedra") && secondPlayer.equals("papel")) {
			return "Jogador 1 venceu";
		}
		
		else if(firstPlayer.equals("papel") && secondPlayer.equals("papel")) {
			return "Ambos venceram";
		}
		
		else if(firstPlayer.equals("pedra") && secondPlayer.equals("pedra")) {
			return "Sem ganhador";
		}
		
		else if(firstPlayer.equals("ataque") && secondPlayer.equals("ataque")) {
			return "Aniquilacao mutua";
		}
		
		else {
			return "Jogador 2 venceu";
		}
	}
}
