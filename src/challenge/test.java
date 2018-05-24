package challenge;

public class test {
    public static void main(String[] args) {
        int num = Integer.parseInt("0000000000", 4);
        String str = Integer.toString(num);
        String modStr = String.format("%10s",str.replaceAll(" ", "0"));
        String modStr2 = String.format("%10s", Integer.toString(num, 4)).replaceAll(" ", "0");


        System.out.println(modStr);
    }
}
