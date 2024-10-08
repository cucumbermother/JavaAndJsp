package Exam01;

public class Ex06 {
    public static void main(String[] args) {
        boolean result1 = 10 > 5;
        System.out.println(result1); // true

        int num1 = 5;
        boolean result2 = num1 >= 10;
        boolean result3 = num1 < 100;
        boolean result4 = num1 < 100 && num1 > 10;
        System.out.println(result2); // true
        System.out.println(result3); // true
        System.out.println(result4); // false
        boolean result5 = result2 && result3;
        System.out.println(result5); // false

    }
}
