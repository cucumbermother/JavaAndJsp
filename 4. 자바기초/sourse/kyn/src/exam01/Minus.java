package exam01;

public class Minus { // kyn exam01 Minus
    int num1;
    int num2;

    public Minus ( int num1 , int num2) {
        this.num1 = num1;
        this.num2 = num2;
        VoidMinusMethod();
    }

    public void VoidMinusMethod (){
        System.out.println(num1 - num2);
    }

    public int CommonMinusMethod() {
        return num1 - num2;
    }
}
