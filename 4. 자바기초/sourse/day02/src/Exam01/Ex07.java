package Exam01;

public class Ex07 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 10;
//        boolean result = num1++ > 10 && num2++ > 10;
        boolean result2 = ++num1 > 10 || ++num2 > 10;
        /**
         * 단락 회로 평가
         * 논리 연산에서 이미 값이 결정된 경우 다음 항 연산 x
         */
        System.out.println(num1); // 11
        System.out.println(num2); // 10
        System.out.println(result2);
    }
}
