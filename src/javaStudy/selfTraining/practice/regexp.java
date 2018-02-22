package javaStudy.selfTraining.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexp {
    public static void main(String[] args) {
        regexpMatch();

//        if (regexpMatch(a)) {
//            System.out.println("OK");
//            print()
//        }
//        else {
//            System.out.println("NG");
//        }
    }

    private static void regexpMatch() {
//        String regex = "^[1-9]";
//        String regex = "^[1-9]*[1-9][0-9]*$";
        String regex = "(do(es)??)";
        String input = "does";

        Pattern ptn = Pattern.compile(regex);
        Matcher m = ptn.matcher(input);

        while (m.find()) {
            System.out.println(m.group());
            System.out.println(m.start());
            System.out.println(m.end());
            System.out.println(m.groupCount());
        }


        // Coz exception since they is  no "m.find()" executed before them."
//        System.out.println(m.group());
//        System.out.println(m.start());
//        System.out.println(m.end());
    }
}
