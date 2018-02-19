package interview;

/*
1－100の整数の内に、3の倍数と数値"3"を含む場合は文字列"hoge"を、
それ以外の場合は該当数値を出力する
*/
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
