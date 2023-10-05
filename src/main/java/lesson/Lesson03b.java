package lesson;

public class Lesson03b {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2,3,1,5}));
    }

    public static int solution(int[] A) {
        int[] tmpArr = new int[A.length+1];
        for (int x : A) {
            tmpArr[x-1] += 1;
        }
        for (int i = 0; i < tmpArr.length; i++) {
            if(tmpArr[i] == 0){
                return i+1;
            }
        }
        return 0;
    }
}
