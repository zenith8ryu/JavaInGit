package challenge;

import challenge.question.*;

import java.util.HashMap;

public class NerilTest {

    public static void main(String[] args) {
        int start = Integer.parseInt("0000000000", 4);
        int end = Integer.parseInt("3333333333", 4);


        for (int i = start; i <= end; i++) {
            String ansStr = String.format("%10s", Integer.toString(i, 4)).replaceAll(" ", "0");
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


            System.out.println("Round" + i);
            for (HashMap.Entry<Integer, String> ent : ansList.entrySet()) {
                System.out.println(ent.getValue());
            }
        }
    }

}


