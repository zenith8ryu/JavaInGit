package javaStudy.selfTraining.basic.arraySpd;

import java.util.ArrayList;
import java.util.List;

public class MainEntrance {
    public static void main(String[] args) {
        Integer[] arr = new Integer[1000000];
        List<Integer> list = new ArrayList<>();

        Integer sum1 = 0;
        Integer sum2 = 0;

        Long time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            sum1 += arr[i % 10];
        }
        Long time2 = System.currentTimeMillis();
        System.out.println("sum time of array: " + (time2 - time1) + "ms");

        Long time3 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            sum2 += list.get(i % 10);
        }
        Long time4 = System.currentTimeMillis();
        System.out.println("sum time of list: " + (time4 - time3) + "ms");

        int[] array_00 = new int[10];
        System.out.println("1-d array: " + array_00.getClass().getName());
        int[][] array_01 = new int[10][10];
        System.out.println("2-d array: " + array_01.getClass().getName());
        int[][][] array_02 = new int[10][10][10];
        System.out.println("3-d array: " + array_02.getClass().getName());

        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] c = new int[]{1, 2, 3, 4, 5};
        if (a.equals(c)) System.out.println("Equals.");
        else {
            System.out.println("Not equals.");
        }
    }
}
