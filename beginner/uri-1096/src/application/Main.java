package application;

public class Main {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 9; i += 2) {
			
			for(int j = 7; j >= 5; j -= 1) {
				System.out.println("I=" + i + " J=" + j);
			}
		}
	}
}
