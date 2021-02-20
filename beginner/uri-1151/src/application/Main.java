package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nextValue = 1, lastValue = 0;
		
		int size = sc.nextInt();
		
		for(int i = 0; i < size; i++) {
			
			if(size - 1 == i) {
				System.out.println(lastValue);
			}
			
			else {
				System.out.print(lastValue + " ");

				int aux = nextValue;
				
				nextValue = (nextValue + lastValue);
				lastValue = aux;
			}
		}
		
		sc.close();
	}
}