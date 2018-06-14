package challenge_liu_v2.question;

import challenge_liu_v2.Puzzle;

import java.util.ArrayList;
import java.util.List;

public class QuestionListFactory {
    public static List<AbstractQuestion> getQuestions(Puzzle puzz) {
        List<AbstractQuestion> list = new ArrayList<>();
        list.add(new Question1(puzz));

        return list;
    }
}
