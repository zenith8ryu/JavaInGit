package challenge.question;

import java.util.HashMap;

public class question06 {
    public static boolean ansCheck(HashMap<Integer, String> ansList) {
        String A1 = ansList.get(1);
        String A2 = ansList.get(2);
        String A3 = ansList.get(3);
        String A4 = ansList.get(4);
        String A5 = ansList.get(5);
        String A6 = ansList.get(6);
        String A7 = ansList.get(7);
        String A8 = ansList.get(8);
        String A9 = ansList.get(9);
        String A10 = ansList.get(10);

        boolean ans1 = A8.equals(A2) && A8.equals(A4);
        boolean ans2 = A8.equals(A1) && A8.equals(A6);
        boolean ans3 = A8.equals(A3) && A8.equals(A10);
        boolean ans4 = A8.equals(A5) && A8.equals(A9);

        return ansChooser.execute(A6, ans1, ans2, ans3, ans4);
    }
}
