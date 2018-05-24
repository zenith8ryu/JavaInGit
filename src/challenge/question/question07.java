package challenge.question;

import java.util.HashMap;

public class question07 {
    public static boolean ansCheck(HashMap<Integer, String> ansList) {
        int cnt_A = 0;
        int cnt_B = 0;
        int cnt_C = 0;
        int cnt_D = 0;

        for (HashMap.Entry<Integer, String> ent : ansList.entrySet()) {
            if (ent.getValue().equals("A")) {
                cnt_A++;
            }
            if (ent.getValue().equals("B")) {
                cnt_B++;
            }
            if (ent.getValue().equals("C")) {
                cnt_C++;
            }
            if (ent.getValue().equals("D")) {
                cnt_D++;
            }
        }

        boolean ans1 = (cnt_C < cnt_B) && (cnt_C < cnt_A) && (cnt_C < cnt_D);
        boolean ans2 = (cnt_B < cnt_C) && (cnt_B < cnt_A) && (cnt_B < cnt_D);
        boolean ans3 = (cnt_A < cnt_C) && (cnt_A < cnt_B) && (cnt_A < cnt_D);
        boolean ans4 = (cnt_D < cnt_C) && (cnt_D < cnt_B) && (cnt_D < cnt_A);

        return ansChooser.execute(ansList.get(7), ans1, ans2, ans3, ans4);
    }
}
