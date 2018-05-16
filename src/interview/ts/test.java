package interview.ts;

import java.util.ArrayList;
import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        double f1 = 1e3;
        double f2 = 1000.1;

        double a1 = Integer.MAX_VALUE;
        double a2 = a1 + f1;
        double a3 = a1 + f2;

        if (a3 == a2) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }

    }
}
