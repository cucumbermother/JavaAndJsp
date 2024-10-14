package exam06;

public class Ex04 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.toUpperCase()); // 예외가 발생하는데 뭔지 모르겠다.

            int num1 = 10; // 이 코드에 대한 catch가 없을시 이코드는 건너뛰고 실행
            int num2 = 0;
            int result = num1 / num2; // ArithmeticException
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
