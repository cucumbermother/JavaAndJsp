package exam05;

public class Ex03 {
    public static void main(String[] args) {
        Customer2 c1 = new Customer2(1000,"기뮤나","duwkrladbsk@naver.com");
        System.out.printf("id=%d, nmae= %S, email=%s%n",c1.id(),c1.name(),c1.email());
        System.out.println(c1);
    }
}
