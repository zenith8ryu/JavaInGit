package javaStudy.selfTraining.algo;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 76, 13, 27};
        sort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int low, int high) {
        if (arr.length <= 0) return;
        if (low >= high) return;

        int partition = partition(arr, low, high);
        sort(arr, low, partition - 1);
        sort(arr, partition + 1, high);
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int left = low;
        int right = high;

        while (left < right) {
            while (left < right && arr[right] >= pivot)
                right--;
            arr[left] = arr[right];

            System.out.println(Arrays.toString(arr));

            while (left < right && arr[left] <= pivot)
                left++;
            arr[right] = arr[left];

            System.out.println(Arrays.toString(arr));
        }

        arr[left] = pivot;

        return left;
    }
}
