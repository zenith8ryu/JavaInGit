package switchCase;

public class SwitchCase {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println(i + "round");
            switch (i) {
                case 1:
                    System.out.println("one");
//                    break;
                case 2:
                    System.out.println("two");
                    break;
            }
        }
    }
}
