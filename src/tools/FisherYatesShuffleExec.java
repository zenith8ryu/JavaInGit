package tools;

import java.util.List;

public class FisherYatesShuffleExec {
    //Array ver.
    public static <T> void Shuffle(T[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            T swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
        }
    }

    //List ver.
    public static <E> void Shuffle(List<E> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));
            E swap = list.get(i);
            list.set(i, list.get(j));
            list.set(j, swap);
        }
    }
}
