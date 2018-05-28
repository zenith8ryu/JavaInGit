package challenge_liu_v2;

import challenge_liu_v2.enums.Choice;

import java.util.List;

public class Tester {

    private static final double PROGRESS_INTERVAL = 0.1;

    public void exec() {
        List<Choice> oneAnwsers = null;
        System.out.println("[tester] test starts...");
        double breakpoint = PROGRESS_INTERVAL;
        for (int idx = 0; idx < AnswerFactory.MAX; idx++) {
            double progress = (double) idx / AnswerFactory.MAX;
            if (progress >= breakpoint) {
                System.out.println(String.format("[tester] %.0f%%(%d/%d) completed...)", breakpoint * 100, idx, AnswerFactory.MAX));
                breakpoint += PROGRESS_INTERVAL;
            }
            oneAnwsers = AnswerFactory.getAnswer(idx);
            Puzzle puzzle = new Puzzle();
            puzzle.fillInAnswer(oneAnwsers);
            puzzle.initQuestions();

//            if (puzzle.test()) {
//                System.out.println("===========================");
//                System.out.println(String.format("Test is OK at %dth time try. \nAnswer: %s", idx, puzzle.printCurrAns()));
//                System.out.println("===========================");
//            }
        }

        System.out.println("[tester] test is over.");

    }
}