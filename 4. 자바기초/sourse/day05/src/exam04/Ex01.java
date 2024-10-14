package exam04;

//import exam03.A;
//import exam03.B;
//import exam03.*; // exam03에 포함된 모든 클래스

import exam03.A;
import exam03.B;

public class Ex01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        // a.num1; // defualt 범위기 때문에 접근 불가
        a.num2 = 10;;; // public 이기 때문에 접근 가능
    }
}
