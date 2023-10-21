package lesson;


public class Lesson04b {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4,1,3,2}));
        System.out.println(solution(new int[]{4,1,3}));
        System.out.println(solution(new int[]{1,1}));
        System.out.println(solution(new int[]{1000000000}));
    }

    public static int solution(int[] A) {
        int max = A[0];
        for (int x : A) {
            if(x > max){
                max = x;
            }
        }
        if(A.length < max){
            return 0;
        }
        int[] tmpArr = new int[A.length > max ? A.length : max];
        for (int x : A) {
            tmpArr[x-1] += 1;
        }
        for (int x : tmpArr) {
            if(x == 0 ){
                return 0;
            }
        }
        return 1;
    }
}
