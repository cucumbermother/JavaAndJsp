package exam03;

public class Ex01 {
    public static void main(String[] args) {
        Integer num1 = new Integer(10);
        Integer num2 = new Integer(20);
        // 연산은 기본형만 된다!, 같은 자료형의 기본 자료형만 된다!
//        int num3 = num1.intValue() + num2.intValue(); // 객체간의 연산 불가, 왜?
        int num3 = num1 + num2; // 자동으로 num1 -> num1.intValue(); 바꿔줌 // 언박싱(자동)
        System.out.println(num3); // 30





    }
}
