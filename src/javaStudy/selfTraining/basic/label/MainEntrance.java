package javaStudy.selfTraining.basic.label;

public class MainEntrance {
    public static void main(String[] args) {
        int cnt = 0;
        outer:
        for (int i = 1; i < 5; i++) {
            cnt++;
            if (cnt == 3) {
                System.out.println("pause");
            }
            for (int j = 1; j < 5; j++) {
                if (i * j > 10) {
                    break;
                }
                System.out.println("cnt" + " = " + cnt);
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
