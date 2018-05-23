package interview.songShuffler.tool;

/**
 * A common merge-sort realization by in-place algorithm.
 */
public class MergeSortArgo {
    private static int[] originArr;
    private static int arrLen;
    private static int[] tempArr = new int[arrLen];

    public static void sortExec(int[] inputArr) {
        originArr = inputArr;
        arrLen = inputArr.length;
        tempArr = new int[arrLen];
        mergeSort(0, arrLen - 1);
    }

    private static void mergeSort(int low, int high) {

        if (low < high) {
            int mid = low + (high - low) / 2;

            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    private static void merge(int low, int mid, int high) {
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
