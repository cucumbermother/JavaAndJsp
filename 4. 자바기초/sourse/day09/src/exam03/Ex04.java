package exam03;

public class Ex04 {
    public static void main(String[] args) {
        Integer num1 = 100; // 오토박싱
        Integer num2 = 200;
        Integer num3 = num1 + num2; // 언박싱 (int로 변환후 연산)
        //오토박싱                   // 객체는 연산이 안됨
        System.out.println(num3);
    }
}
