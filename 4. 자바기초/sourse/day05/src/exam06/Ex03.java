package exam06;

public class Ex03 {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.toUpperCase()); //// NullPointException

            int num1 = 10; // 이 코드에 대한 catch가 없을시 이코드는 건너뛰고 실행
            int num2 = 0;
            int result = num1 / num2; // ArithmeticException
            System.out.println(result);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

//        catch (NullPointerException | ArithmeticException e) {
//            System.out.println(e.getMessage());
//        }
//          // 처리가 각각 다를때
//        catch (NullPointerException e){
//            System.out.println(e.getMessage()); //Cannot invoke "String.toUpperCase()" because "str" is null
//            System.out.println("1번");
//        } catch (ArithmeticException e){
//            System.out.println(e.getMessage()); /// by zero
//            System.out.println("2번");
//        }

        System.out.println("실행 완료");
    }
}
