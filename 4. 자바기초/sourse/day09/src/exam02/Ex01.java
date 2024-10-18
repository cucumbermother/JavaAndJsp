package exam02;

public class Ex01 {
    public static void main(String[] args) {
        String str1 = "ABC"; // 주소가 있고 자원은 힙영역에 있음 // 문자열 상수
        String str2 = "ABC"; // 주소가 있고 자원은 힙영역에 있음 // 문자열 상수

        System.out.printf("str1.equals(str2) : %s%n", str1.equals(str2)); // 동등성 비교
        System.out.printf("str1 == str2 : %s%n", str1 == str2); // 동일성 비교

        System.out.printf("str1 주소 : %d%n", System.identityHashCode(str1));
        System.out.printf("str2 주소 : %d%n", System.identityHashCode(str2));
    }
}
