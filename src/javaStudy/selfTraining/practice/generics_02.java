package javaStudy.selfTraining.practice;

public class generics_02 {
    public static void main(String[] args) {
        excute();
    }

    private static void excute() {
        // Implicit call a generics type method -> bad
        System.out.println((new Fan()).mtd_01(new Integer(10)));
        // explicit call a generics type method -> good
        System.out.println((new Fan()).<Integer>mtd_01(new Integer(10)));
    }

    public class Fan {
        private final

        private <T> T mtd_01(T a) {
            return a;
        }
    }
}
