package overLoad;

public class Overloading {
    static void f(String s, int i) {
        System.out.println("String: " + s + ", int: " + i);
    }

    static void f(int i, String s) {
        System.out.println("int: " + i + ", String: " + s);
    }

    static void test(String s, int i) {
        System.out.println(s);
    }

    static String test(String s) {
        return s;
    }

    public static void main(String[] args) {
        f("String first", 11);
        f(99, "Int first");
    }
}