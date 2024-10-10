package Exam03;

public class ex02 {
    public static void main(String[] args) {
        int result = calc(5);
        System.out.println(result);
        String hello = str("김유나");
        System.out.println(hello);
    }
    static int calc(int x){ // x -> 매개변수
      int y = x * 2 + 3;
      return y; // 함수 종료
    };

    static String str(String x){
        return x + "님 환형합니다";
    }
}
