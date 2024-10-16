package exam05;

public class Outer /* 외부클래스 */ {
    int num1 = 100;
    class Inner { // 인스턴스 내부 클래스
        static int num = 10; // JDK16 이후 가능, JDK15 이전 불가
        final int num2 = 20;
        int num1 = 111;
        void method(){
            System.out.println(num1); // Inner - num1
            System.out.println(Outer.this.num1); // Outer - num1
        }
    }
}
