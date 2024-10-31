package features.calculator;

public abstract class Ab_Calculator implements Calculator{
    @Override
    public int calculator(int num1, int num2) {
        return 0;
    }   
    
    public void resultPrint(int result){
        System.out.println("결과의 값은 " + result + "입니다");
    }
}
