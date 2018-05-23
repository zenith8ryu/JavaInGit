package challenge;

import java.util.HashMap;
import java.util.Stack;

public class NerilTest {
    private static char[] array = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static String numStr = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        String ansNum = String.format("%010d", Integer.valueOf(_10_to_N(10, 2)));
//        System.out.println(ansNum);
        for (HashMap.Entry<Integer, String> ent : ansFulfill(ansNum).entrySet()) {
            System.out.println(ent.getValue());
        }
    }


    public static String _10_to_N(long number, int N) {
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

    public static HashMap<Integer, String> ansFulfill(String ansNum) {
        HashMap<Integer, String> ansList = new HashMap<>();
        int k = 1;

        for (String s : ansNum.split("")) {
            ansList.put(k++, s);
        }

        return ansList;
    }

    public static boolean ansCheck(HashMap<Integer, String> ansList) {
        //Q3
        if () {

            return false;
        }


        return true;
    }

    public boolean ansChkQ3(HashMap<Integer, String> ansList) {
        String A3 = ansList.get(3);

        String A6 = ansList.get(6);
        String A2 = ansList.get(2);
        String A4 = ansList.get(4);

        switch (A3) {
            case "A":
                if (A6.equals(A2) && A6.equals(A4) && !A6.equals(A3)) {
                    return true;
                }
                break;
            case "B":
                if (A2 == A3 && A4 == A3 && A6 != A3) {
                    return true;
                }
                break;
            case "C":
                if (A6 == A3 && A4 == A3 && A2 != A3) {
                    return true;
                }
                break;
            case "D":
                break;

        }

        return false;
    }


}


