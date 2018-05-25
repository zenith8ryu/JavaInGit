package challenge_liu.question;

import java.util.HashMap;

public class question03 {
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

        switch (A3) {
            case "A":
                if (A6.equals(A2) && A6.equals(A4) && !A6.equals(A3)) {
                    return true;
                }
                break;
            case "B":
                if (A3.equals(A2) && A3.equals(A4) && !A3.equals(A6)) {
                    return true;
                }
                break;
            case "C":
                if (A3.equals(A6) && A3.equals(A4) && !A3.equals(A2)) {
                    return true;
                }
                break;
            case "D":
                if (A3.equals(A6) && A3.equals(A2) && !A3.equals(A4)) {
                    return true;
                }
                break;
        }

        return false;
    }

}
