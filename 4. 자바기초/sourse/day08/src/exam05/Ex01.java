package exam05;

public class Ex01 /* extends java.lang.Object*/ {
    public static void main(String[] args) {
        Customer c1 = new Customer(1000,"김유나","dbsk@naver.com");
        Customer c2 = new Customer(1010,"기묘주","gywn@naver.com");
        System.out.println(c1.toString()); // c1.toString() (문자열로 변환)
        // Customer{id=1000, name='김유나', email='dbsk@naver.com'}

        System.out.printf("c1 == c2 : 동일성 ?: %s%n", c1 == c2); // false
        System.out.printf("c1.equals(c2) : 동등성 ? %s%n", c1.equals(c2)); // false
        System.out.printf("c1 주소 ? %d%n", System.identityHashCode(c1)); // c1 주소 ? 2128227771
        System.out.printf("c2 주소 ? %d%n", System.identityHashCode(c2)); // c2 주소 ? 1921595561
    }
}
