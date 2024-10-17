package exam05;

public class Ex07 {
    public static void main(String[] args) {
        String s1 = new String("ABC");
        String s2 = new String("ABC");
        String s3 = "ABC";
        System.out.printf("s1 주소 : %d, hashcode() : %d%n" , System.identityHashCode(s1), s1.hashCode());
        System.out.printf("s2 주소 : %d, hashcode() : %d%n" , System.identityHashCode(s2), s2.hashCode());
        System.out.printf("s3 주소 : %d, hashcode() : %d%n" , System.identityHashCode(s3), s3.hashCode());
        // 주소는 다 같지만 hashcode 값은 다 같다
        // 동일하진 않지만 동등하다
    }
}
