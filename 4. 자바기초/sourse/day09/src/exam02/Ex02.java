package exam02;

public class Ex02 {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println(System.identityHashCode(str)); // 189568618
        str += "DEF";
        System.out.println(System.identityHashCode(str)); // 1922154895
        str += "GHI";
        System.out.println(System.identityHashCode(str)); // 883049899

        /**
         * 문자열 연산을 할때마다 주소값이 달라진다.
         */
        System.out.println(str);
    }
}
