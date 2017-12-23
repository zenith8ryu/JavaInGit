package codility.test;

public class Problem03 {
    public static void main(String[] args) {
        Integer[] A = new Integer[]{1, 2, 3, 1, 4, 5, -1, 1};
        System.out.println(solution(A));

    }

    public static Integer solution(Integer[] arr) {
        int len = arr.length;
        int result = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (arr[i] == arr[j]) {
                    result = Math.max(result, Math.abs(i - j));
                }
            }
        }
        return result;
    }
}
