package piByDart;

import java.util.Random;
import java.util.Scanner;

public class MontePi {
	public static void main(String[] args) {
		Random generator = new Random();
		Scanner in = new Scanner(System.in);
		int tries = in.nextInt();
		int hits = 0;
		double x, y = 0;

	
		for (int i = 0; i <= tries; i++) {
//			x = Math.random();
//			y = Math.random();
			x = generator.nextDouble() * 2 - 1;
			y = generator.nextDouble() * 2 - 1;

			if (x * x + y * y <= 1) {
				hits++;
			}
		}
		System.out.println("Number of tries is " + tries);
		double pi = 4 * (double) hits / (double) tries;
		
		System.out.println(pi);
	}
}