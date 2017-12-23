package buffonPiEstimate;

import java.util.Random;

public class BuffonPiEstimate {
	public static void main(String[] args) {
		int tries = 30000000;
		int hits = 0;

		Random generator = new Random(42);

		for (int i = 0; i < tries; i++) {
			double yLow = generator.nextDouble() * 2;
			double a = generator.nextDouble() * 180;
			double yHigh = yLow + Math.sin(Math.toRadians(a));

			if (yHigh >= 2) {
				hits++;
			}
		}

		double pi = (double) hits / (double) tries;

		System.out.println(pi);
		;
	}
}
