package challenge.question;

import challenge.Tools;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class question10 {
    public static boolean ansCheck(HashMap<Integer, String> ansList) {
        List<Integer> ansCnt = new ArrayList<>();

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

        ansCnt.add(cnt_A);
        ansCnt.add(cnt_B);
        ansCnt.add(cnt_C);
        ansCnt.add(cnt_D);

        int diff = Tools.maxDiff(ansCnt);

        boolean ans1 = diff == 3;
        boolean ans2 = diff == 2;
        boolean ans3 = diff == 4;
        boolean ans4 = diff == 1;

        return ansChooser.execute(A10, ans1, ans2, ans3, ans4);
    }
}
