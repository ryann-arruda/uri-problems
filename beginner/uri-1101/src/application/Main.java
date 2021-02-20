package application;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int M = sc.nextInt();
			int N = sc.nextInt();
			
			if(M <= 0 || N <= 0) {
				break;
			}
			
			else {
				
				if(M > N) {
					int[] numbers = new int[(M - N) + 1];
					int sum = 0;
					
					for(int i = N, j = 0; i <= M; i++, j++) {
						sum += i;
						numbers[j] = i;
					}
					
					String aux = Arrays.toString(numbers);
					aux = aux.replaceAll("\\[", "");
					aux = aux.replaceAll("\\]", "");
					aux = aux.replaceAll("\\,", "");
					
					System.out.println(aux + " Sum=" + sum);
				}
				
				else {
					int[] numbers = new int[(N - M) + 1];
					int sum = 0;
					
					for(int i = M, j = 0; i <= N; i++, j++) {
						sum += i;
						numbers[j] = i;
					}
					
					String aux = Arrays.toString(numbers);
					aux = aux.replaceAll("\\[", "");
					aux = aux.replaceAll("\\]", "");
					aux = aux.replaceAll("\\,", "");
					
					System.out.println(aux + " Sum=" + sum);
				}
			}
		}
		
		sc.close();
	}
}
