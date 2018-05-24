package challenge;

import challenge.question.*;

import java.util.HashMap;

public class NerilTest {

    public static void main(String[] args) {
        int end = (int) Math.pow(4, 10);
        for (int i = 0; i < end; i++) {
            String ansStr = String.format("%010d", Integer.valueOf(Tools.toQuo(i)));
            HashMap<Integer, String> ansList = Tools.ansFulfill(ansStr);

            if (!question01.ansCheck(ansList)) {
                continue;
            }
            if (!question02.ansCheck(ansList)) {
                continue;
            }
            if (!question03.ansCheck(ansList)) {
                continue;
            }
            if (!question04.ansCheck(ansList)) {
                continue;
            }
            if (!question05.ansCheck(ansList)) {
                continue;
            }
            if (!question06.ansCheck(ansList)) {
                continue;
            }
            if (!question07.ansCheck(ansList)) {
                continue;
            }
            if (!question08.ansCheck(ansList)) {
                continue;
            }
            if (!question09.ansCheck(ansList)) {
                continue;
            }
            if (!question10.ansCheck(ansList)) {
                continue;
            }


            for (HashMap.Entry<Integer, String> ent : ansList.entrySet()) {
                System.out.println(ent.getValue());
            }
        }

    }
}


