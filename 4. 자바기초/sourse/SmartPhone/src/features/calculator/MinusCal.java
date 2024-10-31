package features.calculator;

public class MinusCal extends Ab_Calculator {
    @Override
    public int calculator(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public void resultPrint(int result) {
        super.resultPrint(result);
    }
}
