package javaStudy.practice.algo;

import java.util.Random;

public abstract class AlgoExerTester {

    protected Integer[] RNDLIST;
    protected Integer[] result;
    protected final int ARRAY_SIZE = 10;
    protected final int BOUND = Integer.MAX_VALUE;
    protected Random RND = new Random(47);

    protected void init() {
        RNDLIST = new Integer[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            RNDLIST[i] = RND.nextInt(BOUND);
        }

        result = RNDLIST.clone();
    }
}
