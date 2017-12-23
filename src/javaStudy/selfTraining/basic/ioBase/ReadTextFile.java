package ioBase;

import java.io.*;
import java.util.Scanner;

public class ReadTextFile {

    ReadTextFile(String filepath) {
        try (Scanner sc = new Scanner(new File(filepath))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
