package lesson;

public class Lesson02a {
    public static void main(String[] args) {
        for (int x : solution(new int[]{3,8,9,7,6}, 3)) {
            System.out.print(x + " ");
        }
    }
    public static int[] solution(int[] A, int K) {
        int[] tmpArr = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if(i+K < A.length){
                tmpArr[i+K] = A[i];
            }else{
                tmpArr[(i+K)% A.length] = A[i];
            }
        }
        return tmpArr;
    }
}
