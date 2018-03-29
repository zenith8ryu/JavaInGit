package javaStudy.selfTraining.basic.arraySpd;

import java.util.ArrayList;
import java.util.List;

public class MainEntrance {
    public static void main(String[] args) {
        Integer[] arr = new Integer[1000000];
        List<Integer> list = new ArrayList<>();

        Integer sum1 = 0;
        Integer sum2 = 0;

//        Long time1 = System.currentTimeMillis();
//        for (int i = 0; i < 100000000; i++) {
//            sum1 += arr[i % 10];
//        }
//        Long time2 = System.currentTimeMillis();
//        System.out.println("数组求和所花费时间：" + (time2 - time1) + "毫秒");

        Long time3 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            sum2 += list.get(i % 10);
        }
        Long time4 = System.currentTimeMillis();
        System.out.println("List求和所花费时间：" + (time4 - time3) + "毫秒");

//        int[] array_00 = new int[10];
//        System.out.println("一维数组：" + array_00.getClass().getName());
//        int[][] array_01 = new int[10][10];
//        System.out.println("二维数组：" + array_01.getClass().getName());
//        int[][][] array_02 = new int[10][10][10];
//        System.out.println("三维数组：" + array_02.getClass().getName());

//        int[] a = new int[]{1, 2, 3, 4, 5};
//        int[] c = new int[]{1, 2, 3, 4, 5};
//        if (a.equals(c)) System.out.println("Equals.");
//        else {
//            System.out.println("Not equals.");
//        }
    }
}
