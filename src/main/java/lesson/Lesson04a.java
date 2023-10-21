package lesson;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Lesson04a {
    public static void main(String[] args) {
        System.out.println(solution(3, new int[]{1, 3, 1, 3, 2, 1, 3}));
    }

    public static int solution(int X, int[] A) {
        HashSet<Integer> set = new HashSet<>();
        int[] tmpArrEnoughSteps = new int[X];
        for (int x : A) {
            tmpArrEnoughSteps[x-1] += 1;
        }
        for (int i = 0; i < X; i++) {
            if(tmpArrEnoughSteps[i] == 0){
                return -1;
            }
        }
        int[] tmpArr = new int[X];
        for (int i = 0; i < A.length; i++) {
            int x = A[i];
            if(x > 0 && x <= X && !set.contains(x)){
                tmpArr[x-1] = i;
                set.add(x);
            }
        }
        int max = tmpArr[0];
        for (int x : tmpArr) {
            if(x > max){
                max = x;
            }
        }
        return max;
    }
}
