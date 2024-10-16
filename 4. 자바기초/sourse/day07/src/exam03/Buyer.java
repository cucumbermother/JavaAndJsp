package exam03;

public interface Buyer { // JDK 7

    int NUM = 10; // public static final

    void buy();
    default /* 인스턴스 메서드임을 알려주는 키워드 */ void order(){
        System.out.println("Buyer - 주문!");
    }

    private void privateMethod() { // JDK 9
        System.out.println("private 메서드");
    }
     static void staticMethod (){ // public
         System.out.println("정적 메서드");
    }
}
