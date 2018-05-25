package challenge;

public class test {
    public static void main(String[] args) {
        int i = Integer.parseInt("3333313333", 4);
        System.out.println(String.format("%10s", Integer.toString(i+2, 4)).replaceAll(" ", "0"));
//        System.out.println(String.format("%10s", Integer.toString(i+2, 4)));
        System.out.println(String.format("%10d", Integer.toString(i+2, 4)));

    }
}
