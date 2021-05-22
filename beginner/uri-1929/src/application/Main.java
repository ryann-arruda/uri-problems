package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] values = new int[4];
		boolean createTriangle = false;
		
		for(int i = 0; i < 4; i++) {
			values[i] = sc.nextInt();
		}
		
		for(int i = 0; i < 4; i++) {
			int a = values[i];
			
			for(int j = 0; j < 4; j++) {
				
				if(j != i) {
					int b = values[j];
					
					for(int k = 0; k < 4; k++) {
						
						if(k != i && k != j) {
							int c = values[k];
							
							if(a < b + c) {
								if(b < a + c) {
									if(c < a + b) {
										createTriangle = true;
									}
								}
							}
						}
					}
				}
			}
		}
		
		if(createTriangle) {
			System.out.println("S");
		}
		
		else {
			System.out.println("N");
		}
		
		sc.close();
	}
}