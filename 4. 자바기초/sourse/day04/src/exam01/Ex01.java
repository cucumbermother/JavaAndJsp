package exam01;

public class Ex01 {
    public static void main(String[] args) {
        /**
         * main 함수는 프로그램을 시작해 주는 함수
         */
        int num1 = 10; // main 함수의 지역변수
        int num2 = 20;
        int r = add(num1, num2);        System.out.println(r); // 30

        int r1 = add(20,30);
        int r2 = add(50,60,70);

        System.out.println(r1); // 50
        System.out.println(r2); // 180
    }

    /**
     * num1, num2, result - 함수 지역 내에서만 유의미한 변수
     *     - add 함수의 지역 변수
     * @param num1
     * @param num2
     * @return
     */
    static int add(int num1, int num2) { // 변수가 아닌 변수정의 // 함수 지역
        return num1 + num2;
    }
    static int add(int num1, int num2, int num3) { // 변수가 아닌 변수정의 // 함수 지역
        return num1 + num2 + num3;
    }
    // 이름이 같아도 매개변수가 다르기 때문에 오류도 없고 다른 함수라고 할 수 있다.

}
