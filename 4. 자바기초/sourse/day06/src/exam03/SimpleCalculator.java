package exam03;

public class SimpleCalculator extends Calculator {
    @Override
    public int add(int num1, int num2) {
        return num1 + num2 ;
    }

    public SimpleCalculator(){
        super();// 상위 클래스인 Calculator의 기본생성자를 가르킴
    }

    @Override
    public int multiplication(int num1, int num2) {
        return num1 * num2 * num;
    }
}
