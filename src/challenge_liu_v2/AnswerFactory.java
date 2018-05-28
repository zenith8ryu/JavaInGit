package challenge_liu_v2;

import challenge_liu_v2.enums.Choice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnswerFactory {
    public static Integer MAX = Integer.parseInt("3333333333", 4);
    public static Integer START = Integer.parseInt("0000000000", 4);

    public static List<List<Choice>> ALL_ANSWERS;

    static {
        System.out.println("[answer factory] initialization starts");
        ALL_ANSWERS = new ArrayList<>();
        for (int i = START; i <= MAX; i++) {
            String currAnswers = String.format("%10s", Integer.toString(i, 4)).replaceAll(" ", "0");
            Choice[] answers = new Choice[10];
            for (int j = 0; j < 10; j++) {
                char testChar = currAnswers.charAt(j);
                int currAnswer = Character.getNumericValue(testChar);
                answers[j] = Choice.values()[currAnswer];
            }
            ALL_ANSWERS.add(Arrays.asList(answers));
        }
    }

    public static List<Choice> getAnswer(int index) {
        return ALL_ANSWERS.get(index);
    }
}
