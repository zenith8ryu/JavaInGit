package ioBase;

public class MainExe {
    final static String FILE_NAME = "/Users/zenith7ryu/Documents/Test.txt";

    public static void main(String[] args) {
        new WriteTextFile(FILE_NAME);
        new ReadTextFile(FILE_NAME);
    }
}
