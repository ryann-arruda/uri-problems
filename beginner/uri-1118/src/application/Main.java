package application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		boolean test = true;
		
		do {
			int code = 0, count = 0;
			double total = 0.0, average = 0.0;
			
			while(count < 2) {
				double aux = sc.nextDouble();
				
				if(aux >= 0.0 && aux <= 10.0) {
					total += aux;
					count++;
				}
				
				else {
					System.out.println("nota invalida");
				}
			}
			
			average = total/count;
			
			System.out.printf("media = %.2f%n", average);
			
			while(code != 1 && code != 2) {
				System.out.println("novo calculo (1-sim 2-nao)");
				
				code = sc.nextInt();
				
				if(code == 1) {
					break;
				}
				
				else if(code == 2) {
					test = false;
				}
			}
			
		}while(test);
		
		sc.close();
	}
}
