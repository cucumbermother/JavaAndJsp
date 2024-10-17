package exam01;

public class MinusTest {
    public static void main(String[] args) {
        Minus minus = new Minus(55 , 30); // 25 (VoidMinusMethod함수 호출)
        // 객체를 생성하면 생성자 안의 것들이 동작한다

        int a = minus.CommonMinusMethod();
        System.out.println(a); // 25 (CommonMinusMethod함수 호출)
        // 이미 num1,num2의 값은 생성자에서 초기화 되었기 때문에 따로 정의 하지않아도 된다

        minus.num1 = 100;
        minus.num2 = 50;
        System.out.println(minus.CommonMinusMethod()); // 50
        // num1, num2의 값이 재정의가 됨
    }
}
