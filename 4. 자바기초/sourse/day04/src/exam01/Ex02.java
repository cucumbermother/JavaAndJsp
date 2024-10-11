package exam01;

public class Ex02 {
    public static void main(String[] args) {
        method1();
        hi("김유나여왕");
        hi("이용호");

    }
    static void method1(){
        System.out.println("반환값이 없는 함수");
    }
    static void hi(String x){
        for (int i = 1; i <= x.length(); i++ ){
            System.out.println(x + "님 어서오세요");
        }
    }



}
