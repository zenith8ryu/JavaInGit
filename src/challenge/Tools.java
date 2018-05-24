package challenge;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class Tools {
    private static char[] array = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static String numStr = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static String decimal_to_n(long number, int N) {
        Long rest = number;
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder(0);
        while (rest != 0) {
            stack.add(array[new Long((rest % N)).intValue()]);
            rest = rest / N;
        }
        for (; !stack.isEmpty(); ) {
            result.append(stack.pop());
        }

        return result.length() == 0 ? "0" : result.toString();
    }

    public static int strToAscii(String str) {
        byte[] bytes = str.getBytes();
        byte b = bytes[0];

        for (int i = 0; i < bytes.length; i++) {
            b = bytes[i];
        }
        return Integer.valueOf(b);
    }

    public static int toQuo(int num) {
        int res = 0;
        if (num > 0) {
            toQuo(num / 4);
            res = num % 4;
        }

        return res;
    }

    public static void toBin(int num) {
        if (num > 0) {
            toBin(num / 2);

            System.out.print(num % 2);
        }

    }

    public static int charToAscii(char c) {
        return (int) c;
    }

    public static char strToChar(String str) {
        return str.toCharArray()[0];
    }

    public static int maxDiff(List<Integer> list) {
        int s = list.size();
        int i = 0;
        int max = 0;

        while (i < s) {
            int j = i + 1;
            while (j < s) {
                int diff = Math.abs(list.get(i) - list.get(j));
                max = (max < diff) ? diff : max;
                j++;
            }
            i++;
        }
        return max;
    }

    public static HashMap<Integer, String> ansFulfill(String ansStr) {
        HashMap<Integer, String> ansList = new HashMap<>();
        int k = 1;

        for (String s : ansStr.split("")) {
            switch (s) {
                case "0":
                    ansList.put(k++, "A");
                    break;
                case "1":
                    ansList.put(k++, "B");
                    break;
                case "2":
                    ansList.put(k++, "C");
                    break;
                case "3":
                    ansList.put(k++, "D");
                    break;
            }
        }

        return ansList;
    }
}
