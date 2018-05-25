package challenge_liu.question;

import challenge_liu.Tools;

import java.util.HashMap;

public class question08 {
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

        boolean ans1 = !(Math.abs(Tools.strToAscii(A7) - Tools.strToAscii(A1)) == 1);
        boolean ans2 = !(Math.abs(Tools.strToAscii(A5) - Tools.strToAscii(A1)) == 1);
        boolean ans3 = !(Math.abs(Tools.strToAscii(A2) - Tools.strToAscii(A1)) == 1);
        boolean ans4 = !(Math.abs(Tools.strToAscii(A10) - Tools.strToAscii(A1)) == 1);

        return ansChooser.execute(A8, ans1, ans2, ans3, ans4);
    }

}
