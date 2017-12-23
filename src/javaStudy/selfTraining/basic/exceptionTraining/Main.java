package exceptionTraining;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws MyException {
//        String file = "C:\\IO\\exceptionTest.txt";
//        FileReader reader;
//
//        try {
//            reader = new FileReader(file);
//            Scanner in = new Scanner(reader);
//            StringBuffer sb = new StringBuffer();
//
//            while (in.hasNext()) {
//                sb.append(in.next()).append(" ");
//            }
//            System.out.println(sb);
//
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//            System.out.println("Sorry, no file found.");
//        } finally {
//            System.out.println("This scanning is end.");
//        }

        try {
            myExceptionFirstTest();
        } catch (MyException e) {
            System.out.println("First exception caught.");
        }

    }


    private static void myExceptionFirstTest() throws MyException {
        String[] sexs = {"男性", "女性", "中性"};
        for (int i = 0; i < sexs.length; i++) {
            if ("中性".equals(sexs[i])) {
                throw new MyException("你全家都是中性！");
            } else {
                System.out.println(sexs[i]);
            }
        }
    }
}
