package application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int MINUTES = 60;
		
		int xSpeed = 60, ySpeed = 90;
		int differenceXAndY = ySpeed - xSpeed;
		
		int distance, time;
		
		distance = sc.nextInt();
		
		time = (distance * MINUTES)/differenceXAndY;
		
		System.out.println(time + " minutos");
		
		sc.close();
	}
}
