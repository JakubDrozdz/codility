package lesson;

public class Lesson01 {
    public static void main(String[] args) {
        System.out.println(solution(529));
    }
    public static int solution(int N) {
        String binaryString = Integer.toBinaryString(N);
        int result = 0;
        for (int i = 0; i < binaryString.length(); i++) {
            if(binaryString.charAt(i) == '1'){
                int counter = 0;
                for (int j = i + 1; j < binaryString.length(); j++) {
                    if(binaryString.charAt(j) == '0'){
                        counter++;
                    }
                    if(binaryString.charAt(j) == '1'){
                        if(counter > result){
                            result = counter;
                        }
                        break;
                    }
                }
            }
        }
        return result;
    }
}
