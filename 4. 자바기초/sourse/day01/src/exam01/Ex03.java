package exam01;

public class Ex03 {
    public static void main(String[] args) {
        char ch = 'A';
        System.out.println( ch +  1 );

        char ch2 = '가';
        System.out.println( ch2 + 2 );

        System.out.println( ch2 < '나' ); // '가'보다 '나'의 유니코드가 작음 true
    }
}
