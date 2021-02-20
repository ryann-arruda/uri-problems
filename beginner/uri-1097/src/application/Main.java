package application;

public class Main {
	public static void main(String[] args) {
		int J = 7;
		
		for(int i = 1; i <= 9; i += 2) {
			
			for(int k = 0; k < 3; k++) {
				int aux = (J + i) - 1;
				
				System.out.println("I=" + i + " J=" + aux);
				
				J--;
			}
			
			J = 7;
		}
	}
}
