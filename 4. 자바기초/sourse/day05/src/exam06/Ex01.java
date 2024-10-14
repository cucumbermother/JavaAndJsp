package exam06;

public class Ex01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
//        int result = num1 / num2; // ArithmethicException - RuntimeException
//        System.out.println(result); // Exception in thread "main" java.lang.ArithmeticException: / by zero
        try {
            int result = num1 / num2;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("예외발생!!");
        }

        System.out.println("매우 중요한 코드 실행.... "); // 코드가 안나오고 프로세스 종료
    }
}
