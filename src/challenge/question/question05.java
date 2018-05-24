package challenge.question;

import java.util.HashMap;

public class question05 {
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

        boolean ans1 = A5.equals(A8);
        boolean ans2 = A5.equals(A4);
        boolean ans3 = A5.equals(A9);
        boolean ans4 = A5.equals(A7);

        return ansChooser.execute(A4, ans1, ans2, ans3, ans4);
    }
}
