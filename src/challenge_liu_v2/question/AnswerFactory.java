package challenge_liu_v2.question;

import challenge_liu_v2.enums.Choice;

import java.util.ArrayList;
import java.util.List;

public class AnswerFactory {
    private static final Integer MAX = Integer.parseInt("3333333333", 4);
    private static final Integer START = Integer.parseInt("0000000000", 4);

    public static List<List<Choice>> ALL_ANSWERS;

    static {
        ALL_ANSWERS = new ArrayList<>();

        for (int i = START; i < MAX; i++) {

        }

    }
}
