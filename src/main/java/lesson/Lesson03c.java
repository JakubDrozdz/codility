package lesson;

public class Lesson03c {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3,1,2,4,3}));
    }

    public static int solution(int[] A) {
        int leftSum = A[0];
        int rightSum = 0;
        for (int i =  1; i < A.length; i++) {
            rightSum += A[i];
        }
        int minDiff = Math.abs(leftSum - rightSum);
        for (int i = 1; i < A.length - 1; i++) {
            leftSum += A[i];
            rightSum -= A[i];
            int diff = Math.abs(leftSum - rightSum);
            if(diff < minDiff){
                minDiff = diff;
            }
        }
        return minDiff;
    }
}
