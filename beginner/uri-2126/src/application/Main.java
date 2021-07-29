package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String N1, N2;
		int index = 1, position = 0;
		
		do {
			int subsequenceAmount = 0;
			boolean isSubsequence = false;
			N1 = in.readLine();
			N2 = in.readLine();
			
			if(N1 != null) {
				for(int i = 0; i < N2.length(); i++) {
					for(int j = 0; j < N1.length(); j++) {
						
						if(i + j > N2.length() - 1 || N1.charAt(j) != N2.charAt(i + j)) {
							break;
						}
						
						else if(j == N1.length() - 1){
							subsequenceAmount++;
							position = i;
							isSubsequence = true;
						}
					}
				}
				
				System.out.println("Caso #" + index + ":");
				if(isSubsequence) {
					System.out.println("Qtd.Subsequencias: " + subsequenceAmount);
					System.out.println("Pos: " + (++position));
				}
				
				else {
					System.out.println("Nao existe subsequencia");
				}
				
				System.out.println();
				index++;
			}
			
		} while(N1 != null);
	}
}