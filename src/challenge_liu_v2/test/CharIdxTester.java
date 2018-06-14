package challenge_liu_v2.test;

import challenge_liu_v2.enums.Choice;

public class CharIdxTester {
    public static void exec() {
        String currAnswers = "1234567890";
        for (int j = 0; j < 10; j++) {
            int currAnswer = Character.getNumericValue(currAnswers.charAt(j));
            System.out.println(currAnswer);
        }
    }

    public static void main(String[] args) {
        exec();
    }
}
