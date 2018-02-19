package interview;

public class problem_01 {
    public static void main(String[] args) {
        hoge();
    }

    private static void hoge() {
        for (int i = 1; i <= 100; i++) {
            String str = String.valueOf(i);
            if (str.contains("3")) {
                System.out.println("hoge");
                continue;
            }

            if (i % 3 == 0) {
                System.out.println("hoge");
                continue;
            }

            System.out.println(i);
        }
    }
}
