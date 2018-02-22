package javaStudy.selfTraining.practice;

public class switch_case {
    public static void main(String[] args) {
        caseTest(2);
    }

    private static void caseTest(Integer trigger) {
        switch (trigger) {
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
        }
    }
}
