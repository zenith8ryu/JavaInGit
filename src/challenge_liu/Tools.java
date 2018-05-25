package challenge_liu;

import java.util.HashMap;
import java.util.List;

public class Tools {
    public static int strToAscii(String str) {
        byte[] bytes = str.getBytes();
        byte b = bytes[0];

        for (int i = 0; i < bytes.length; i++) {
            b = bytes[i];
        }
        return (int) b;
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
