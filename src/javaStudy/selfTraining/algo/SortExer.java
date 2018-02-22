package javaStudy.selfTraining.algo;

import java.util.Random;

public class SortExer {

    private static Integer[] RNDLIST;
    private static Integer[] result;
    private static final int ARRAY_SIZE = 1000;
    private static final int BOUND = Integer.MAX_VALUE;
    private static Random RND = new Random(47);



    private static void init() {
        RNDLIST = new Integer[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            RNDLIST[i] = RND.nextInt(BOUND);
        }

        result = RNDLIST.clone();
    }

    public static void main(String[] args) {
        init();
    }


}
