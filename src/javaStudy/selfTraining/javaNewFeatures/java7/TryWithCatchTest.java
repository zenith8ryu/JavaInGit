package javaStudy.selfTraining.javaNewFeatures.java7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithCatchTest {
    final static String path = "C:\\Users\\works\\IntelliJIdeaProjects\\JavaInGit\\src\\data\\test.csv";

    public static void exec() {

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
