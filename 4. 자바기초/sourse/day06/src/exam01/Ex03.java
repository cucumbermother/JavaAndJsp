package exam01;

public class Ex03 {
    public static void main(String[] args) {
        C c = new C(); // C -> B , A // 다형성
        B b = c;
        A a = c;

        System.out.println(a == c); // true
        System.out.println(b == c); // true

        System.out.printf("a는 C에서 유래되었는가? %s%n",a instanceof C); // true
        System.out.printf("b는 C에서 유래되었는가? %s%n",b instanceof C); // true
        System.out.printf("a는 B에서 유래되었는가? %s%n",a instanceof B); // true
        System.out.printf("a는 A에서 유래되었는가? %s%n",a instanceof A); // true
        // 전부 true 이유? a, b, c 객체는 다 동일, 유래도 동일



    }
}
