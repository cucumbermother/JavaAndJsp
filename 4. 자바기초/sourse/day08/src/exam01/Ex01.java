package exam01;

public class Ex01 { // day08 exam01.Ex01
    public static void main(String[] args) {
        try {
            int num1 = 10;
            int num2 = 0;
            int result = num1 / num2;
            System.out.println(result);
            System.out.println("정상 실행!");
        }catch (ArithmeticException e){
            e.printStackTrace(); // 정보확인 //발생위치부터 오류난 지점까지 확인 가능
            System.out.println("예외 발생!");
        } finally {
            System.out.println("무조건 실행!");
        }
    }
}
