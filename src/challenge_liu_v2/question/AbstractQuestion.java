package challenge_liu_v2.question;


import challenge_liu_v2.Puzzle;
import challenge_liu_v2.enums.Choice;
import challenge_liu_v2.enums.Question;

import java.util.ArrayList;
import java.util.List;


public abstract class AbstractQuestion {
    protected List<ChoiceContent> choices;
    protected final Question label;
    protected Puzzle puzzle;

    AbstractQuestion(Puzzle puzzle, Question label) {
        this.puzzle = puzzle;
        this.label = label;
    }

    public boolean exec(Choice anwser) {
        setup();
        choices = initChoices();
        return test(anwser);
    }

    protected void setup() {
        return;
    }

    public boolean test(Choice answer) {
        return choices.get(answer.ordinal()).execTest(  );
    }

    protected List<ChoiceContent> initChoices() {
        List<ChoiceContent> choices = new ArrayList<>();
        ChoiceContent choiceA = initChoiceA();
        ChoiceContent choiceB = initChoiceB();
        ChoiceContent choiceC = initChoiceC();
        ChoiceContent choiceD = initChoiceD();
        choices.add(choiceA);
        choices.add(choiceB);
        choices.add(choiceC);
        choices.add(choiceD);

        return choices;
    }

    protected abstract ChoiceContent initChoiceA();
    protected abstract ChoiceContent initChoiceB();
    protected abstract ChoiceContent initChoiceC();
    protected abstract ChoiceContent initChoiceD();


    protected abstract class ChoiceContent {

        protected Choice label;

        public ChoiceContent(Choice label) {
            this.label = label;
        }

        public boolean execTest() {
            setupContent();
            return test();
        }

        protected abstract boolean test();

        protected void setupContent() {
            return;
        }
    }
}
