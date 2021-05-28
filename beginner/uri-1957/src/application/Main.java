package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Integer> result = new ArrayList<>();
		int V = 0, quotient = 0;
		boolean firstIteration = true;
		
		V = sc.nextInt();
		
		do {
			if(firstIteration) {
				quotient = V/16;
				result.add(V % 16);
				firstIteration = false;
			}
			
			else {
				int beforeUpdate = quotient;
				quotient = quotient/16;
				result.add(beforeUpdate % 16);
			}
			
			if(quotient < 16) {
				int aux  = quotient % 16;
				if(aux != 0) {
					result.add(aux);
				}
			}
			
		}while(quotient > 16);		
		
		
		System.out.println(listReverse(result));		
		
		sc.close();
	}
	
	public static String listReverse(List<Integer> originalList) {
		String aux = "";
		
		for(int i = originalList.size() - 1; i >= 0; i--) {
			
			if(originalList.get(i) == 10) {
				aux = aux.concat("A");
			}
			
			else if(originalList.get(i) == 11) {
				aux = aux.concat("B");
			}
			
			else if(originalList.get(i) == 12) {
				aux = aux.concat("C");
			}
			
			else if(originalList.get(i) == 13) {
				aux = aux.concat("D");
			}
			
			else if(originalList.get(i) == 14) {
				aux = aux.concat("E");
			}
			
			else if(originalList.get(i) == 15) {
				aux = aux.concat("F");
			}
			
			else {
				aux = aux.concat(originalList.get(i).toString());
			}
		}
		
		return aux;
	}
}