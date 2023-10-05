package lesson;

public class Lesson02b {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{9,3,9,3,9,7,9}));
    }
    public static int solution(int[] A) {
        int result = 0;
        for (int x : A) {
            result ^= x;
        }
        return result;
    }
}
