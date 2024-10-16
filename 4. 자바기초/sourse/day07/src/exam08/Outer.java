package exam08;
import exam02.Calculator;

public class Outer {

    private static final Calculator cal = new Calculator() {
        @Override
        public int add(int num1, int num2) {
            return num1 + num2;
        }
    };

    Calculator method( int num3) { // num3을 final로 선언
        // 익명 내부 클래스
        return new Calculator() {
            @Override
            public int add(int num1, int num2) {
                return num1 + num2 + num3;
            }
        };
    }
}
