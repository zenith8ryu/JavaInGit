package javaStudy.selfTraining.algo;

public class MergeSort {
    private int[] originArr;
    private int arrLen;
    private int[] tempArr = new int[arrLen];

    public static void main(String[] args) {
        int[] arr = {19, 1, 2, 1, 10, 4, 15};
        MergeSort m = new MergeSort();
        m.sort(arr);
        for (int i : m.originArr) {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    private void sort(int[] inputArr) {
        this.originArr = inputArr;
        this.arrLen = inputArr.length;
        this.tempArr = new int[arrLen];
        mergeSort(0, arrLen - 1);

    }

    private void mergeSort(int low, int high) {

        if (low < high) {
            int mid = low + (high - low) / 2;

            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    private void merge(int low, int mid, int high) {
        int s1 = mid - low + 1;
        int s2 = high - mid;


        int[] L = new int[s1];
        int[] R = new int[s2];

        for (int i = 0; i < s1; i++) {
            L[i] = originArr[low + i];
        }
        for (int i = 0; i < s2; i++) {
            R[i] = originArr[mid + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = low;

        while (i < s1 && j < s2) {
            if (L[i] <= R[j]) {
                originArr[k++] = L[i++];
            } else {
                originArr[k++] = R[j++];
            }
        }

        while (i < s1) {
            originArr[k++] = L[i++];
        }
    }
}
