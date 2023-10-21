package lesson;

import java.util.LinkedHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lesson04c {
    public static void main(String[] args) {
        for (int x : solution(5, new int[]{3, 4, 4, 6, 1, 6, 6, 2, 6, 4, 6, 3, 6, 6})) {
            System.out.println(x);
        }
    }

    public static int[] solution(int N, int[] A) {
        int[] counter = new int[N];
        int max = -1;
        int currentMin = 0;

        for (int i = 0; i < A.length; i++) {
            int x = A[i];
            if (x >= 1 && x <= N) {
                if (counter[x - 1] < currentMin) {
                    counter[x - 1] = currentMin;
                }
                counter[x - 1] = counter[x - 1] + 1;
                if (counter[x - 1] > max) {
                    max = counter[x - 1];
                }
            } else if (x == N + 1) {
                currentMin = max;
            }
        }
        for (int i = 0; i < N; i++) {
            if (counter[i] < currentMin) counter[i] = currentMin;
        }
        return counter;
    }


}
