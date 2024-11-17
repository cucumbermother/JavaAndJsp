package test04;

import test5.AppStart;

import java.util.ArrayList;

public class Test {
    int num1;

    public boolean istrue ( boolean x ) {
        num1 = 6;
        return x;
    }
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.istrue(true));
        System.out.println(test.num1);
    }
}
