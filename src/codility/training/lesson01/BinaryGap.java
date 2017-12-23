package lesson01;

public class BinaryGap {
    public static void main(String[] args) {

        System.out.println(solution(100000));
    }

    public static int solution(int N) {
        System.out.println(N);
        System.out.println(Integer.toBinaryString(N));

        int max = 0;
        int flg = 0;
        int cnt = 0;

        while (N > 0) {
            if ((N & 1) == 1) {
                if (flg == 0) {
                    flg = 1;
                } else {
                    max = max < cnt ? cnt : max;
                }
                cnt = 0;
            } else {
                cnt++;
            }
            N = N >> 1;
        }
        return max;
    }
}
