package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int evenCount = 0;
		int oddCount = 0;
		
		int[] even = new int[5];
		int[] odd = new int[5];
		
		for(int i = 0; i < 15; i++) {
			int aux = sc.nextInt();
			
			if(aux % 2 == 0) {
				even[evenCount] = aux;
				evenCount++;
			}
			
			else {
				odd[oddCount] = aux;
				oddCount++;
			}
			
			if(evenCount == 5) {
				for(int j = 0; j < 5; j++) {
					System.out.println("par[" + j + "] = " + even[j]);
				}
				
				evenCount = 0;
			}
			
			if(oddCount == 5) {
				for(int j = 0; j < 5; j++) {
					System.out.println("impar[" + j + "] = " + odd[j]);
				}
				
				oddCount = 0;
			}
		}
		
		for(int i = 0; i < oddCount; i++) {
			System.out.println("impar[" + i + "] = " + odd[i]);
		}

		
		for(int i = 0; i < evenCount; i++) {
			System.out.println("par[" + i + "] = " + even[i]);
		}
		
		sc.close();
	}
}
