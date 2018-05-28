package challenge_liu_v2.test;

import challenge_liu_v2.test.ClassInitializingTester;

public class TestExecutor {
    public static void main(String[] args) {
//        classInitializingTest();
        formatTest();
    }

    private static void classInitializingTest() {
        System.out.println("start initialization");
        System.out.println("Initializing instance: sub 1");
        ClassInitializingTester.Sub sub1 = new ClassInitializingTester.Sub();
        System.out.println("Initializing instance: parent 1");
        ClassInitializingTester.Parent par1 = new ClassInitializingTester.Parent();
        System.out.println("Initializing instance: sub 2");
        ClassInitializingTester.Sub sub2 = new ClassInitializingTester.Sub();
        System.out.println("initialization completed");
    }


    private static void formatTest() {
        FormatTester.exec();
    }
}
