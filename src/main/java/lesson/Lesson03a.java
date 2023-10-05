package lesson;

public class Lesson03a {
    public static void main(String[] args) {
        System.out.println(solution(3, 999111321, 7));
    }
    public static int solution(int X, int Y, int D) {
        return (Y-X)%D==0 ? (Y-X)/D : ((Y-X)/D)+1;
    }
}
