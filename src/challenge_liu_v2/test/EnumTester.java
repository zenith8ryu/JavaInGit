package challenge_liu_v2.test;

import challenge_liu_v2.enums.Question;

public class EnumTester {
//    public static void main(String[] args) {
//        exec();
//    }

    public static void exec() {
        for (Question ques : Question.values()) {
            if (ques.toString() instanceof String) {
                System.out.println(ques.ordinal() + "\n" + ques);
            }
        }
    }

}

